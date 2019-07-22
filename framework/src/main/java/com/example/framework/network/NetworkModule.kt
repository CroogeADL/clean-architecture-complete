package com.example.framework.network

import android.content.Context
import com.example.domain.common.Mapper
import com.example.domain.common.ResultData
import com.example.framework.BuildConfig
import com.example.framework.common.DEFAULT_ERROR_MESSAGE
import com.example.framework.common.getErrorMessage
import com.example.framework.network.model.ResponseData
import com.example.framework.network.module.internal.Internal
import retrofit2.Call
import java.lang.Exception

const val API_ENDPOINT = "https://api.icndb.com/jokes/"

object NetworkModule {

    private val internal by lazy {
        Internal(API_ENDPOINT, printLogs = BuildConfig.DEBUG)
    }

    fun internal() = internal

    internal fun isConnected(context: Context): Boolean {
        //todo make some checking for internet connection
        return false
    }
}

internal fun <T> Call<T>.execute(): ResultData<T> {
    return try {
        val response = execute()
        if (response.isSuccessful) {
            ResultData(response.body(), null)
        } else {
            ResultData(null, response.errorBody()?.string() ?: DEFAULT_ERROR_MESSAGE)
        }
    } catch (e: Exception) {
        ResultData(null, e.getErrorMessage())
    }
}

internal fun <T, R> Call<ResponseData<T>>.execute(mapper: Mapper<T, R>): ResultData<R> {
    return try {
        val response = execute()
        if (response.isSuccessful) {
            ResultData(response.body()?.value?.let { mapper.map(it) }, null)
        } else {
            ResultData(null, response.errorBody()?.string() ?: DEFAULT_ERROR_MESSAGE)
        }
    } catch (e: Exception) {
        ResultData(null, e.getErrorMessage())
    }
}