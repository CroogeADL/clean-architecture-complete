package com.example.framework.network.module.internal.api

import com.example.framework.network.model.ResponseData
import com.example.framework.network.model.joke.ChuckNorrisJokeResponse
import retrofit2.Call
import retrofit2.http.GET

private const val RANDOM_JOKE_PATH = "random"

internal interface ChuckNorrisJokesService {

    @GET(RANDOM_JOKE_PATH)
    fun getRandomJoke(): Call<ResponseData<ChuckNorrisJokeResponse>>
}