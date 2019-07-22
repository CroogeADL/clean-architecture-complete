package com.example.cleanarchitectureandroidexample.di

import com.example.cleanarchitectureandroidexample.di.module.ChuckNorrisJokeUseCaseModule
import com.example.usecase.UseCase
import com.example.usecase.joke.ChuckNorrisRandomJokeUseCase

class UseCaseProvider {
    private val repositoryProvider by lazy { RepositoryProvider() }

    private val chuckNorrisJokeUseCaseModule by lazy {
        ChuckNorrisJokeUseCaseModule(repositoryProvider.repositoryChuckNorrisJokes)
    }

    @Suppress("UNCHECKED_CAST")
    fun <U : UseCase> provideUseCase(type: Class<U>): U? {
        var useCase: UseCase? = null
        when (type) {
            ChuckNorrisRandomJokeUseCase::class.java -> {
                useCase = chuckNorrisJokeUseCaseModule.chuckNorrisRandomJokeUseCase
            }
        }
        return useCase as U
    }
}