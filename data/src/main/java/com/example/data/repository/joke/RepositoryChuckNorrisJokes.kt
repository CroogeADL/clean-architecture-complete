package com.example.data.repository.joke

import com.example.domain.common.ResultData
import com.example.domain.joke.ChuckNorrisJoke

interface RepositoryChuckNorrisJokes {
    fun getRandomJoke(): ResultData<ChuckNorrisJoke>
    fun getRandomJokeAsync(onResult: (resultData: ResultData<ChuckNorrisJoke>) -> Unit)
}