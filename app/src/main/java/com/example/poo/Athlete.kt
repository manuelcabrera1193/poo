package com.example.poo

import android.util.Log
import com.example.poo.models.Person
import com.google.gson.Gson

open class Athlete(val person: Person) {
    override fun toString(): String {
        return Gson().toJson(this)
    }

    open fun action(){
        Log.i("Action:", "descansar")
    }

    open fun competir(){}
}

