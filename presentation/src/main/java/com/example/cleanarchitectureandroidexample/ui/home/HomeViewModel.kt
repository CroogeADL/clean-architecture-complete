package com.example.cleanarchitectureandroidexample.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.cleanarchitectureandroidexample.common.BaseViewModel
import com.example.usecase.joke.ChuckNorrisRandomJokeUseCase

class HomeViewModel(private val chuckNorrisRandomJokeUseCase: ChuckNorrisRandomJokeUseCase) :
    BaseViewModel() {

    val chuckNorrisJokeUi: LiveData<ChuckNorrisJokeUi> = MutableLiveData()

    fun start() {
        loadNextChuckNorrisJoke()
    }

    fun onNextClicked() {
        loadNextChuckNorrisJoke()
    }

    private fun loadNextChuckNorrisJoke() {
        chuckNorrisRandomJokeUseCase.getRandomJokeAsync { result ->
            result.data?.let { joke ->
                chuckNorrisJokeUi.setValue(ChuckNorrisJokeToChuckNorrisJokeUiMapper().map(joke))
            }
        }
    }
}