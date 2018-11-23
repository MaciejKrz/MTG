package pl.rod.mtg.mtg.ui.main

import android.arch.lifecycle.Observer
import android.support.v4.app.Fragment
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import kotlinx.android.synthetic.main.main_fragment.life_player_2
import kotlinx.android.synthetic.main.main_fragment.life_player_1
import kotlinx.android.synthetic.main.main_fragment.plusLifeButton_player_1
import kotlinx.android.synthetic.main.main_fragment.plusLifeButton_player_2
import kotlinx.android.synthetic.main.main_fragment.resetButton
import kotlinx.android.synthetic.main.main_fragment.wheel_life_player_1
import kotlinx.android.synthetic.main.main_fragment.wheel_life_player_2
import pl.rod.mtg.mtg.R

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val model = ViewModelProviders.of(this).get(MainViewModel::class.java)

        model.getPlayerOneLifeCount().observe(this, Observer<Int>{life ->
            life_player_1.text = life.toString()
        })

        model.getPlayerTwoLifeCount().observe(this, Observer<Int>{life ->
            life_player_2.text = life.toString()
        })

        life_player_1.setOnClickListener { model.decreasePlayerOneLife() }

        life_player_2.setOnClickListener { model.decreasePlayerTwoLife() }

        plusLifeButton_player_1.setOnClickListener { model.increasePlayerOneLife() }

        plusLifeButton_player_2.setOnClickListener { model.increasePlayerTwoLife() }

        resetButton.setOnClickListener { model.resetLife() }

        configureWheels(model)
    }

    private fun configureWheels(model: MainViewModel) {
        wheel_life_player_1.visibility = View.GONE
        wheel_life_player_1.setMax(60)
        wheel_life_player_1.setMin(0)
        wheel_life_player_1.scrollTo(20)
        wheel_life_player_2.visibility = View.GONE
        wheel_life_player_2.setMax(60)
        wheel_life_player_2.setMin(0)
        wheel_life_player_2.scrollTo(20)
    }

}
