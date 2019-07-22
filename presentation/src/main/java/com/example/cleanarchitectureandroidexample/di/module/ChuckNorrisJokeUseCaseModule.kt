package com.example.cleanarchitectureandroidexample.di.module

import com.example.data.repository.joke.RepositoryChuckNorrisJokes
import com.example.usecase.joke.ChuckNorrisRandomJokeUseCase

internal class ChuckNorrisJokeUseCaseModule(private val chuckNorrisJokesRepository: RepositoryChuckNorrisJokes) {
    val chuckNorrisRandomJokeUseCase by lazy {
        ChuckNorrisRandomJokeUseCase(chuckNorrisJokesRepository)
    }
}