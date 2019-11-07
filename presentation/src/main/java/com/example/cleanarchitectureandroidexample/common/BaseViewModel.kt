package com.example.cleanarchitectureandroidexample.common

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    protected fun <T> LiveData<T>.setValue(value: T) {
        if (this is MutableLiveData<T>) this.value = value
    }

    protected fun <T> LiveData<T>.postValue(value: T) {
        if (this is MutableLiveData<T>) this.postValue(value)
    }
}