package com.example.framework.network.mapper.joke

import com.example.domain.joke.ChuckNorrisJoke
import com.example.domain.common.Mapper
import com.example.framework.network.model.joke.ChuckNorrisJokeResponse

internal class ChuckNorrisJokeResponseToChuckNorrisJokeMapper :
    Mapper<ChuckNorrisJokeResponse, ChuckNorrisJoke> {
    override fun map(model: ChuckNorrisJokeResponse) = ChuckNorrisJoke(model.joke)
}