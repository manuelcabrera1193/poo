package com.example.poo.athletes

import android.util.Log
import com.example.poo.Athlete
import com.example.poo.interfaces.ICyclist
import com.example.poo.models.Person
import com.example.poo.enums.StyleCyclist

class Cyclist(
    person: Person,
    override var styleCyclist: StyleCyclist,
    override var speedCyclist: Double
) :
    Athlete(person), ICyclist {

    companion object {
        const val TAG = "Swimmer"
    }

    private var style: StyleCyclist = styleCyclist

    fun getStyle() = this.style

    fun setStyle(style: StyleCyclist) {
        this.style = style
    }

    private var speed: Double = speedCyclist

    fun getSpeed() = this.speed

    fun setSpeed(speed: Double) {
        this.speed = speed
    }

    override fun competir() {
        Log.i(TAG,"voy a pedalear!!!")
    }

    override fun action() {
        Log.i(TAG,"style: ${style.name} speed: $speed")
    }
}