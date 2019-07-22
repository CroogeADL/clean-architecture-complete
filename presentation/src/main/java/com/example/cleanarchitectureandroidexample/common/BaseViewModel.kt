package com.example.cleanarchitectureandroidexample.common

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.cleanarchitectureandroidexample.di.UseCaseProvider
import com.example.usecase.UseCase

abstract class BaseViewModel(application: Application) : AndroidViewModel(application) {

    private val useCaseProvider by lazy { UseCaseProvider() }

    protected fun <T> LiveData<T>.setValue(value: T) {
        if (this is MutableLiveData<T>) this.value = value
    }

    protected fun <T> LiveData<T>.postValue(value: T) {
        if (this is MutableLiveData<T>) this.postValue(value)
    }

    protected fun <U : UseCase> provideUseCase(type: Class<U>): U? = useCaseProvider.provideUseCase(type)
}