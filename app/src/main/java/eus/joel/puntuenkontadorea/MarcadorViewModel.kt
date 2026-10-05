package eus.joel.puntuenkontadorea

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class MarcadorViewModel : ViewModel() {

    var puntosA = mutableIntStateOf(0)
    var puntosB = mutableIntStateOf(0)

    fun sumarA() {
        puntosA.intValue++
    }

    fun restarA() {
        if (puntosA.intValue > 0) {
            puntosA.intValue--
        }
    }

    fun sumarB() {
        puntosB.intValue++
    }

    fun restarB() {
        if (puntosB.intValue > 0) {
            puntosB.intValue--
        }
    }

    fun reset() {
        puntosA.intValue = 0
        puntosB.intValue = 0
    }
}