package com.example.poo.enums

enum class StyleSwimmer {
    BUTTERFLY,
    FATHOM
}


enum class cards {
    DIGITAL,
    CREDIT,
    DEBIT
}


enum class TypeLine {
    PREPAGO,
    POSTPAGO
}

enum class FormaDePago(val simbolo: String, val topoMinimo: Double, val topeMaximo: Double) {
    EFECTIVO("S", 1.0, 200.0),
    TARJETA("T", 5.0, 500.0),
    YAPE("Y", 1.0, 250.0),
    PLIN("P", 1.0, 500.0),
    UNDEFINED("", 0.0, 0.0);
}

fun getForCode(code: String): FormaDePago {
    return when (code) {
        "S" -> FormaDePago.EFECTIVO
        "T" -> FormaDePago.TARJETA
        else -> FormaDePago.UNDEFINED
    }
}

