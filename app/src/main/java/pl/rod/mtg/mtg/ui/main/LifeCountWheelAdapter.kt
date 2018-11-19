package pl.rod.mtg.mtg.ui.main

import com.super_rabbit.wheel_picker.WheelAdapter

class LifeCountWheelAdapter: WheelAdapter {
    //get item value based on item position in wheel
    override fun getValue(position: Int): String {
        return position.toString()
    }

    //get item position based on item string value
    override fun getPosition(vale: String): Int {
        return 0
    }

    //return a string with the approximate longest text width, for supporting WRAP_CONTENT
    override fun getTextWithMaximumLength(): String {
        return "00"
    }

    //return the maximum index
    override fun getMaxIndex(): Int {
        return 50
    }

    //return the minimum index
    override fun getMinIndex(): Int {
        return 0
    }
}