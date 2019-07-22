package com.example.usecase.joke

import com.example.data.repository.joke.RepositoryChuckNorrisJokes
import com.example.domain.common.ResultData
import com.example.domain.joke.ChuckNorrisJoke
import com.example.usecase.UseCase

class ChuckNorrisRandomJokeUseCase(private val chuckNorrisJokesRepository: RepositoryChuckNorrisJokes) : UseCase {

    fun getRandomJoke(): ResultData<ChuckNorrisJoke> = chuckNorrisJokesRepository.getRandomJoke()

    fun getRandomJokeAsync(onResult: (resultData: ResultData<ChuckNorrisJoke>) -> Unit) =
        chuckNorrisJokesRepository.getRandomJokeAsync(onResult)
}