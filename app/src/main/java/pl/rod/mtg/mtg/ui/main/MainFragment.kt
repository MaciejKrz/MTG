package pl.rod.mtg.mtg.ui.main

import android.arch.lifecycle.Observer
import android.support.v4.app.Fragment
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import kotlinx.android.synthetic.main.main_fragment.life_player_2
import kotlinx.android.synthetic.main.main_fragment.life_player_1
import pl.rod.mtg.mtg.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.getPlayerOneLifeCount().observe(this, Observer<Int>{ value ->
           // life_player_1.text = value.toString()
        })

        viewModel.getPlayerTwoLifeCount().observe(this, Observer<Int>{ value ->
            life_player_2.text = value.toString()
        })
    }
}
