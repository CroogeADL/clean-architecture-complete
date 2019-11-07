package com.example.cleanarchitectureandroidexample.di

import com.example.data.repository.joke.ChuckNorrisJokesRepository
import com.example.data.repository.joke.RepositoryChuckNorrisJokes
import com.example.framework.network.NetworkModule
import org.koin.dsl.module

val repositoryModule = module {
    single<RepositoryChuckNorrisJokes> { ChuckNorrisJokesRepository(NetworkModule.internal().chuckNorrisJokes()) }
}