package com.example.poo.athletes

import android.util.Log
import com.example.poo.Athlete
import com.example.poo.interfaces.ICyclist
import com.example.poo.interfaces.IRunner
import com.example.poo.interfaces.ISwimmer
import com.example.poo.models.Person
import com.example.poo.enums.StyleCyclist
import com.example.poo.enums.StyleRunner
import com.example.poo.enums.StyleSwimmer

class TriAthlete(
    person: Person,
    override var styleRunner: StyleRunner,
    override var styleCyclist: StyleCyclist,
    override var styleSwimmer: StyleSwimmer,
    override var speedCyclist: Double,
    override var speedRunner: Double,
    override var speedSwimmer: Double,
    var competirMessage: String,
    var actionMessage: String
) : Athlete(person), IRunner, ISwimmer, ICyclist {

    private var _styleCyclist: StyleCyclist = styleCyclist

    fun getStyleCyclistLocal() = _styleCyclist

    private var _speedCyclist: Double = speedCyclist

    fun getSpeedCyclistLocal() = _speedCyclist


    override fun competir() {
        Log.i("TriAthlete:", _competir)
    }

    override fun action() {
        Log.i("TriAthlete:", "$_action")
    }

    private var _competir: String = competirMessage


    fun setCompetir(newMessage: String){
        this._competir = newMessage
    }

    private var _action: String = actionMessage


    fun setAction(newMessage: String){
        this._action = newMessage
    }

}