package com.example.poo

import android.util.Log
import android.view.View
import com.example.poo.athletes.TriAthlete
import com.example.poo.athletes.TriAthlete2
import com.example.poo.enums.Actions
import com.example.poo.models.Person
import com.example.poo.enums.StyleCyclist
import com.example.poo.enums.StyleRunner
import com.example.poo.enums.StyleSwimmer

object ValuesDefault {
    var isDark: Boolean = true

    fun changeTheme() {
        Log.i("valuesDefault", "cambio el tema")
        isDark = !isDark
    }
}

class MainActivity : BaseActivity(), IMainActivity, View.OnClickListener {

    override var page: Int = 1
    val tiempoDeEspera = AddDelay()

    override fun printOnResume() {
        Log.i(TAG, "Mensaje desde el interfaz")
    }

    companion object {
        const val TAG = "MainActivity"
    }


    override fun addInOnCreate() {

        tiempoDeEspera.showMessageDelay()

        val subClase2 = AddDelay.SubClase2()
        subClase2.printDefaultSubClase2()

        Log.i(TAG, "is dark : ${ValuesDefault.isDark}")
        ValuesDefault.changeTheme()

        Log.i(TAG, "agregamos codigo desde MainActivity")

        val personTriAtleta = Person("Tri Atleta 1", 1.90, 60.0, 25)

        var competir = "Voy a nadar ...."
        var action = "Nadando ...."

        var triAtleta = TriAthlete(
            personTriAtleta,
            StyleRunner.MARATHON,
            StyleCyclist.TYPE01,
            StyleSwimmer.BUTTERFLY,
            30.0,
            25.0,
            20.0,
            competir,
            action
        )

        triAtleta.action()
        triAtleta.competir()

        triAtleta.setCompetir("Voy a correr ....")
        triAtleta.setAction("Corriendo ....")

        triAtleta.action()
        triAtleta.competir()


        triAtleta.setCompetir("Voy a biclicletiar ....")
        triAtleta.setAction("bicicletiando ....")

        triAtleta.action()
        triAtleta.competir()


        var triAtleta2 = TriAthlete2(
            personTriAtleta,
            StyleRunner.MARATHON,
            StyleCyclist.TYPE01,
            StyleSwimmer.BUTTERFLY,
            30.0,
            25.0,
            20.0
        )

        triAtleta2.competir()
        triAtleta2.action()


        triAtleta2.setNewAction(Actions.NADAR)
        triAtleta2.competir()
        triAtleta2.action()

        triAtleta2.setNewAction(Actions.CORRER)
        triAtleta2.competir()
        triAtleta2.action()

        triAtleta2.setNewAction(Actions.BICICLETEAR)
        triAtleta2.competir()
        triAtleta2.action()

    }


    override fun onResume() {
        super.onResume()
        printOnResume()
        tiempoDeEspera.showMessageDelay2()
        Log.i("OnResume", "Se enfoca la pantalla desde $TAG-----")
    }


    override fun onDestroy() {
        tiempoDeEspera.SubClase1().printValues()
        super.onDestroy()
        destroy()
    }

    override fun onClick(p0: View?) {
        when (p0) {
            // TODO p0 -> la vista
            // viewTextTitle -> { /** Aqui se ejecuta el código **/}
        }
    }

}

class AddDelay(val delay: Double = 100.0) {

    var initValue = 20
    var endValue = 30

    fun AddDelay.empty() {
        initValue = 0
        endValue = 0
    }


    fun showMessageDelay() {
        Log.i("AddDelay", "El tiempo de esta pantalla es de $delay")
    }

    fun showMessageDelay2() {
        Log.i("init AddDelay", "Te queda 30 segundos, ¿deseas continuar?")
    }

    fun printSalto() {
        Log.i("ejemplo de salto", "\n\n")
    }


    inner class SubClase1 {
        fun printValues() {
            for (item in initValue..endValue) {
                Log.i("SubClase1: ", "Item Value: $item")
                printSalto()
            }
        }
    }

    class SubClase2() {
        fun printDefaultSubClase2() {
            Log.i("ejemplo de SubClase2", "printDefaultSubClase2 SubClase2")
        }
    }

}







