package com.example.framework.network.model

import com.google.gson.annotations.SerializedName

internal data class ResponseData<T>(
    @SerializedName("type") val type: String,
    @SerializedName("value") val value: T
)