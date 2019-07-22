package com.example.framework.network.model.joke

import com.google.gson.annotations.SerializedName

internal data class ChuckNorrisJokeResponse(
    @SerializedName("id") val id: Long,
    @SerializedName("joke") val joke: String
)