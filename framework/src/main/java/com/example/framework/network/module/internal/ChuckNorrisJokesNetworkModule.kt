package com.example.framework.network.module.internal

import com.example.data.datasource.network.internal.NetworkModuleChuckNorrisJokes
import com.example.domain.common.ResultData
import com.example.domain.joke.ChuckNorrisJoke
import com.example.framework.network.execute
import com.example.framework.network.mapper.joke.ChuckNorrisJokeResponseToChuckNorrisJokeMapper
import com.example.framework.network.module.AbstractModule
import com.example.framework.network.module.internal.api.ChuckNorrisJokesService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

internal class ChuckNorrisJokesNetworkModule(service: ChuckNorrisJokesService) :
    AbstractModule<ChuckNorrisJokesService>(service),
    NetworkModuleChuckNorrisJokes {

    override fun getRandomJoke(): ResultData<ChuckNorrisJoke> =
        getRandomJokeCall().execute(ChuckNorrisJokeResponseToChuckNorrisJokeMapper())

    override fun getRandomJokeAsync(onResult: (resultData: ResultData<ChuckNorrisJoke>) -> Unit) {
        launch {
            val response = withContext(Dispatchers.IO) {
                getRandomJokeCall().execute(ChuckNorrisJokeResponseToChuckNorrisJokeMapper())
            }
            onResult(response)
        }
    }

    private fun getRandomJokeCall() = service.getRandomJoke()
}