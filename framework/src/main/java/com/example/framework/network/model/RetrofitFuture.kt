package com.example.framework.network.model

import com.example.domain.common.Future
import retrofit2.Call

internal class RetrofitFuture<T>(private val call: Call<T>) : Future {
    override fun cancel() {
        call.cancel()
    }

    override fun isCanceled() = call.isCanceled

    override fun isExecuted() = call.isExecuted
}