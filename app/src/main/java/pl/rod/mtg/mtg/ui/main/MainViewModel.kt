package pl.rod.mtg.mtg.ui.main

import android.arch.lifecycle.*


class MainViewModel : ViewModel() {
    private lateinit var playerOneLifeCount: MutableLiveData<Int>
    private lateinit var playerTwoLifeCount: MutableLiveData<Int>

    fun getPlayerOneLifeCount(): LiveData<Int> {
        if (!::playerOneLifeCount.isInitialized) {
            playerOneLifeCount = MutableLiveData<Int>().apply { setValue(20)}
        }

        return playerOneLifeCount
    }

    fun getPlayerTwoLifeCount(): LiveData<Int> {
        if (!::playerTwoLifeCount.isInitialized) {
            playerTwoLifeCount = MutableLiveData<Int>().apply { setValue(20)}
        }

        return playerTwoLifeCount
    }

    fun decreasePlayerOneLife(): LiveData<Int> {
        return playerOneLifeCount.apply { setValue(playerOneLifeCount.value!! - 1)}
    }

    fun decreasePlayerTwoLife(): LiveData<Int> {
        return playerTwoLifeCount.apply { setValue(playerTwoLifeCount.value!! - 1)}
    }

    fun increasePlayerOneLife(): LiveData<Int> {
        return playerOneLifeCount.apply { setValue(playerOneLifeCount.value!! + 1)}
    }

    fun increasePlayerTwoLife(): LiveData<Int> {
        return playerTwoLifeCount.apply { setValue(playerTwoLifeCount.value!! + 1)}
    }

    fun resetLife() {
        playerOneLifeCount.apply { setValue(20)}
        playerTwoLifeCount.apply { setValue(20)}
    }

}
