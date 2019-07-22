package com.example.cleanarchitectureandroidexample.ui.home

import com.example.domain.joke.ChuckNorrisJoke
import com.example.domain.common.Mapper

class ChuckNorrisJokeToChuckNorrisJokeUiMapper : Mapper<ChuckNorrisJoke, ChuckNorrisJokeUi> {
    override fun map(model: ChuckNorrisJoke) = ChuckNorrisJokeUi(model.joke)
}