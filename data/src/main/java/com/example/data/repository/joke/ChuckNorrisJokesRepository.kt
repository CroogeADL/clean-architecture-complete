package com.example.data.repository.joke

import com.example.data.datasource.network.internal.NetworkModuleChuckNorrisJokes
import com.example.domain.common.ResultData
import com.example.domain.joke.ChuckNorrisJoke

class ChuckNorrisJokesRepository(private val networkModuleChuckNorrisJokes: NetworkModuleChuckNorrisJokes) :
    RepositoryChuckNorrisJokes {

    override fun getRandomJoke(): ResultData<ChuckNorrisJoke> = networkModuleChuckNorrisJokes.getRandomJoke()

    override fun getRandomJokeAsync(onResult: (resultData: ResultData<ChuckNorrisJoke>) -> Unit) =
        networkModuleChuckNorrisJokes.getRandomJokeAsync(onResult)
}