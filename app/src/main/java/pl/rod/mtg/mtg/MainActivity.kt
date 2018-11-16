package pl.rod.mtg.mtg

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.main_fragment.life_player_2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val numberPicker = findViewById<biz.borealis.numberpicker.NumberPicker>(R.id.life_player_1)

        numberPicker.min = 0
        numberPicker.max = 40
        numberPicker.textSize = 180.0F
        numberPicker.textSizeSelected = 340.0F
        //numberPicker.selectedNumber = 20
//        numberPicker.onValueChangeListener { picker, oldVal, newVal ->
//
//            //Display the newly selected number to text view
//            //text_view.text = "Selected Value : $newVal"
//        }
    }

    fun decreasePlayerOne(view: View) {
//        val newValue = life_player_1.text.toString().toInt() - 1
//        life_player_1.text = newValue.toString()
    }

    fun decreasePlayerTwo(view: View) {
        val newValue = life_player_2.text.toString().toInt() - 1
        life_player_2.text = newValue.toString()
    }

}
