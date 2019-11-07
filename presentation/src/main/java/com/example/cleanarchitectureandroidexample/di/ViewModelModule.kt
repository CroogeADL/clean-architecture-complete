package com.example.cleanarchitectureandroidexample.di

import com.example.cleanarchitectureandroidexample.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}