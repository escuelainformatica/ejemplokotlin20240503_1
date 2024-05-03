package cl.eftec.app20240503_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cl.eftec.app20240503_1.ui.theme.App20240503_1Theme
import java.security.Principal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App20240503_1Theme {
                Principal()
            }
        }
    }
}
@Composable
fun ListadoCliente(cvm:ClienteViewModelo) {
    Column {
        for (cliente in cvm.clientes) {
            Text("nombre: ${cliente.nombre.value} edad:${cliente.edad.value}")
        }
    }
}
@Composable
fun FormularioCliente(cvm:ClienteViewModelo) {
    Column {
        TextField(value = cvm.cliente.nombre.value, onValueChange = {cvm.cliente.nombre.value=it})
        TextField(value = cvm.cliente.rut, onValueChange = {cvm.cliente.rut=it})
        TextField(value = cvm.cliente.edad.value.toString(), onValueChange = {cvm.SetEdad(it)})
        TextField(value = cvm.cliente.deuda.value.toString(), onValueChange = {cvm.SetDeuda(it)})
        ElevatedButton(onClick = { cvm.AgregarCliente() }) {
            Text("Agregar cliente")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    App20240503_1Theme {
        Greeting("Android")
    }
}