package com.example.framework.network.module.internal

import com.example.data.datasource.network.internal.NetworkModuleChuckNorrisJokes
import com.example.framework.network.module.internal.api.ChuckNorrisJokesService
import com.example.framework.network.module.internal.base.BaseAPI

class Internal(baseUrl: String, printLogs: Boolean) : BaseAPI(baseUrl, printLogs) {

    private val chuckNorrisJokesNetworkModule by lazy {
        ChuckNorrisJokesNetworkModule(restAdapter.create(ChuckNorrisJokesService::class.java))
    }

    override fun chuckNorrisJokes(): NetworkModuleChuckNorrisJokes = chuckNorrisJokesNetworkModule
}