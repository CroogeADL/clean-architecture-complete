package com.example.cleanarchitectureandroidexample.di

import com.example.data.repository.joke.ChuckNorrisJokesRepository
import com.example.framework.network.NetworkModule

internal class RepositoryProvider {
    val repositoryChuckNorrisJokes by lazy {
        ChuckNorrisJokesRepository(NetworkModule.internal().chuckNorrisJokes())
    }
}