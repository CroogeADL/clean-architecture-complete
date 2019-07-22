package com.example.framework.network.module

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

internal abstract class AbstractModule<T>(protected val service: T) : CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main
}