package pl.rod.mtg.mtg.ui.main

import android.arch.lifecycle.*


class MainViewModel : ViewModel() {
    private lateinit var playerOneLifeCount: LiveData<Int>
    private lateinit var playerTwoLifeCount: LiveData<Int>

    fun getPlayerOneLifeCount(): LiveData<Int> {
        if (!::playerOneLifeCount.isInitialized) {
            playerOneLifeCount = MutableLiveData<Int>().apply { postValue(20)}
        }

        return playerOneLifeCount
    }

    fun getPlayerTwoLifeCount(): LiveData<Int> {
        if (!::playerTwoLifeCount.isInitialized) {
            playerTwoLifeCount = MutableLiveData<Int>().apply { postValue(20)}
        }

        return playerTwoLifeCount
    }

    fun decreasePlayerOneLife(): LiveData<Int> {
        return MutableLiveData<Int>().apply { postValue(playerOneLifeCount.value!! - 1)}
    }

    fun decreasePlayerTwoLife(): LiveData<Int> {
        return MutableLiveData<Int>().apply { postValue(playerTwoLifeCount.value!! - 1)}
    }

}
