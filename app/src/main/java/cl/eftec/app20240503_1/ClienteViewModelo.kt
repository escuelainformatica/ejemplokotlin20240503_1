package cl.eftec.app20240503_1

import androidx.compose.runtime.mutableStateListOf

class ClienteViewModelo {
    var cliente=Cliente()
    var clientes= mutableStateListOf<Cliente>()
    fun AgregarCliente() {
        val clienteNuevo=Cliente()
        clienteNuevo.nombre.value=cliente.nombre.value
        clienteNuevo.rut=cliente.rut
        clienteNuevo.edad.value=cliente.edad.value
        clienteNuevo.deuda.value=cliente.deuda.value
        clientes.add(clienteNuevo)
        cliente.nombre.value=""
        cliente.rut=""
        cliente.edad.value=0
        cliente.deuda.value=0
    }
    fun SetEdad(edad:String) {
        try {
            cliente.edad.value = edad.toInt()
        } catch(ex:Exception) {
           // cliente.edad.value=0
        }
    }
    fun SetDeuda(deuda:String) {
        try {
            cliente.deuda.value = deuda.toInt()
        } catch(ex:Exception) {
           // cliente.deuda.value=0
        }
    }
}