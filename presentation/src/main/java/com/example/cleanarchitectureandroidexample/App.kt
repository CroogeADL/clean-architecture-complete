package com.example.cleanarchitectureandroidexample

import android.app.Application
import com.example.cleanarchitectureandroidexample.di.repositoryModule
import com.example.cleanarchitectureandroidexample.di.useCaseModule
import com.example.cleanarchitectureandroidexample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initDi()
    }

    private fun initDi() {
        startKoin {
            androidContext(this@App)
            modules(listOf(repositoryModule, useCaseModule, viewModelModule))
        }
    }
}