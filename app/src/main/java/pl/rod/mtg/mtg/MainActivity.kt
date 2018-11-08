package pl.rod.mtg.mtg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.main_fragment.*
import pl.rod.mtg.mtg.R
import pl.rod.mtg.mtg.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()
//        }
    }

    fun decreasePlayerOne(view: View) {
        val newValue = life_player_1.text.toString().toInt() - 1
        life_player_1.text = newValue.toString()
    }

    fun decreasePlayerTwo(view: View) {
        val newValue = life_player_2.text.toString().toInt() - 1
        life_player_2.text = newValue.toString()
    }

}
