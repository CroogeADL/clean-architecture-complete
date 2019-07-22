package com.example.framework.common

const val DEFAULT_ERROR_MESSAGE = "Sorry, something went wrong."

fun Throwable?.getErrorMessage() = this?.message ?: DEFAULT_ERROR_MESSAGE