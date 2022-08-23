package com.example.poo

import android.util.Log

interface IMainActivity {

    var page : Int

    fun printOnResume()

    fun destroy() {
        Log.i("IMainActivity", "destruye pantalla")
    }
}
