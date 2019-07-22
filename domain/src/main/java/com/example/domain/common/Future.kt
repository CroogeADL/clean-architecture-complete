package com.example.domain.common

interface Future {
    fun cancel()
    fun isCanceled(): Boolean
    fun isExecuted(): Boolean
}