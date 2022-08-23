package com.example.poo.athletes

import android.util.Log
import com.example.poo.Athlete
import com.example.poo.enums.StyleRunner
import com.example.poo.interfaces.IRunner
import com.example.poo.models.Person

class Runner(
    person: Person,
    override var styleRunner: StyleRunner,
    override var speedRunner: Double
) :
    Athlete(person), IRunner {

    companion object {
        const val TAG = "Runner"
    }

    private var style: StyleRunner = styleRunner

    fun getStyle() = this.style

    fun setStyle(style: StyleRunner) {
        this.style = style
    }

    private var speed: Double = speedRunner

    fun getSpeed() = this.speed

    fun setSpeed(speed: Double) {
        this.speed = speed
    }


    override fun competir() {
        Log.i(TAG, "voy a correr!!!")
    }

    override fun action() {
        Log.i(TAG, "action -> style: ${style.name} speed: $speed")
    }
}