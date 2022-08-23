package com.example.poo.athletes

import android.util.Log
import com.example.poo.Athlete
import com.example.poo.enums.Actions
import com.example.poo.interfaces.ICyclist
import com.example.poo.interfaces.IRunner
import com.example.poo.interfaces.ISwimmer
import com.example.poo.models.Person
import com.example.poo.enums.StyleCyclist
import com.example.poo.enums.StyleRunner
import com.example.poo.enums.StyleSwimmer

class TriAthlete2(
    person: Person,
    override var styleRunner: StyleRunner,
    override var styleCyclist: StyleCyclist,
    override var styleSwimmer: StyleSwimmer,
    override var speedCyclist: Double,
    override var speedRunner: Double,
    override var speedSwimmer: Double,
    actions: Actions = Actions.DESCANSANDO
) : Athlete(person), IRunner, ISwimmer, ICyclist {

    private var _styleCyclist: StyleCyclist = styleCyclist

    fun getStyleCyclistLocal() = _styleCyclist

    private var _speedCyclist: Double = speedCyclist

    fun getSpeedCyclistLocal() = _speedCyclist


    override fun competir() {
        Log.i("TriAthlete2:", getMessageCompetir())
    }

    override fun action() {
        Log.i("TriAthlete2:", getMessageAction())
    }

    private var _actions: Actions = actions

    fun setNewAction(action: Actions) {
        this._actions = action
    }

    private fun getMessageCompetir(): String {
        return when (_actions) {
            Actions.CORRER -> "Voy a correr ..."
            Actions.NADAR -> "Voy a nadar ..."
            Actions.BICICLETEAR -> "voy a bicicletiar"
            Actions.DESCANSANDO -> "estoy descansando"
        }
    }

    private fun getMessageAction(): String {
        return when (_actions) {
            Actions.CORRER -> "corriendo ..."
            Actions.NADAR -> "nadando ... "
            Actions.BICICLETEAR -> "bicicletiando ..."
            Actions.DESCANSANDO -> "descansando ..."
        }
    }


}