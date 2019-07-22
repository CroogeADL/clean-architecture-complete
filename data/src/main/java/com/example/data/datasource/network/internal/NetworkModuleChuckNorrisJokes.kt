package com.example.data.datasource.network.internal

import com.example.domain.common.ResultData
import com.example.domain.joke.ChuckNorrisJoke

interface NetworkModuleChuckNorrisJokes {
    fun getRandomJoke(): ResultData<ChuckNorrisJoke>
    fun getRandomJokeAsync(onResult: (resultData: ResultData<ChuckNorrisJoke>) -> Unit)
}