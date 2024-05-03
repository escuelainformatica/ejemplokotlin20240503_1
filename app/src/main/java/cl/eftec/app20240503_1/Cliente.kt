package cl.eftec.app20240503_1

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class Cliente {
    var rut by mutableStateOf("")
    var nombre= mutableStateOf("")
    var edad = mutableStateOf(0)
    var deuda = mutableStateOf(0)
}