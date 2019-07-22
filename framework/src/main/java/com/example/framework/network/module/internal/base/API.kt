package com.example.framework.network.module.internal.base

import com.example.data.datasource.network.internal.NetworkModuleChuckNorrisJokes

internal interface API {
    fun chuckNorrisJokes(): NetworkModuleChuckNorrisJokes
}