package com.example.cleanarchitectureandroidexample.di

import com.example.usecase.joke.ChuckNorrisRandomJokeUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { ChuckNorrisRandomJokeUseCase(get()) }
}