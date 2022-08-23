package com.example.poo.models

import com.google.gson.Gson
import java.io.Serializable

data class Person(
    val name: String, val height: Double, val weight: Double, val age: Int
) : Serializable {
    override fun toString(): String {
        return Gson().toJson(this)
    }
}
