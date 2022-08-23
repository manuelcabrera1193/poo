package com.example.poo.athletes

import android.util.Log
import com.example.poo.Athlete
import com.example.poo.interfaces.ISwimmer
import com.example.poo.models.Person
import com.example.poo.enums.StyleSwimmer

class Swimmer(
    person: Person,
    override var styleSwimmer: StyleSwimmer,
    override var speedSwimmer: Double,
) :
    Athlete(
        person
    ), ISwimmer {

    companion object {
        const val TAG = "Swimmer"
    }

    private var style: StyleSwimmer = styleSwimmer

    fun getStyle() = this.style

    fun setStyle(style: StyleSwimmer) {
        this.style = style
    }

    private var speed: Double = speedSwimmer

    fun getSpeed() = this.speed

    fun setSpeed(speed: Double) {
        this.speed = speed
    }


    override fun competir() {
        Log.i(TAG, "voy a nadar!!")
    }

    override fun action() {
        Log.i(Cyclist.TAG, "style: ${style.name} speed: $speed")
    }
}