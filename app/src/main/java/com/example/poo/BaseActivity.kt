package com.example.poo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.poo.athletes.Runner
import com.example.poo.athletes.Swimmer
import com.example.poo.models.Person
import com.example.poo.enums.FormaDePago
import com.example.poo.enums.StyleRunner
import com.example.poo.enums.StyleSwimmer
import com.example.poo.enums.getForCode

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("Nadador 1", 1.80, 60.0, 25)
        val person1 = Person("Corredor 1", 1.70, 68.0, 30)

        var atleta1 = Swimmer(person, StyleSwimmer.FATHOM, 30.0)
        atleta1.competir()
        atleta1.action()
        atleta1.setStyle(StyleSwimmer.BUTTERFLY)
        atleta1.competir()
        atleta1.action()
        Log.i("style atleta 1 : ", atleta1.getStyle().name)
        Log.i("atleta 1 : ", atleta1.toString())

        val formaDePago = FormaDePago.YAPE
        Log.i("formaDePago 1 : ", "${formaDePago.simbolo} *********************************************")

        val forma = getForCode("T")

        Log.i("formaDePago 2 : ", "${forma.simbolo} *********************************************")
        Log.i("formaDePago 2 : ", "tope máximo${forma.topeMaximo} *********************************************")
        Log.i("formaDePago 2 : ", "tope mínimo${forma.topoMinimo} *********************************************")



        var atleta2 = Runner(person1, StyleRunner.MARATHON, 20.0)
        atleta2.competir()
        atleta2.action()
        atleta2.setStyle(StyleRunner.METROS100SMOOTH)
        atleta2.competir()
        atleta2.action()
        Log.i("style atleta 2 : ", atleta2.getStyle().name)
        Log.i("atleta 2 : ", atleta2.toString())


        fun diferenciaEdades(atleta1 : Athlete, atleta2: Athlete) : Int {
            return atleta1.person.age - atleta2.person.age
        }

        val result  = diferenciaEdades(atleta2 , atleta1)
        Log.i("diferenciaEdades:", "$result")

        addInOnCreate()
    }


    open fun addInOnCreate(){}


    override fun onDestroy() {
        Log.i("onDestroy", "inicio la destrucción")
        super.onDestroy()
        Log.i("onDestroy", "Se destruye por completo")
    }


    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        Log.i("OnResume", "Se enfoca la pantalla -----")
    }


    override fun onStart() {
        super.onStart()
    }

}
