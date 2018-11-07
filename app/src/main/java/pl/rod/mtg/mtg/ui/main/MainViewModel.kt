package pl.rod.mtg.mtg.ui.main

import android.arch.lifecycle.*


class MainViewModel : ViewModel() {
    private lateinit var playerOneLifeCount: LiveData<Int>

    fun getPlayerOneLifeCount(): LiveData<Int> {
        if (!::playerOneLifeCount.isInitialized) {
            playerOneLifeCount = MutableLiveData<Int>().apply { postValue(20)}
        }

        return playerOneLifeCount
    }

}
