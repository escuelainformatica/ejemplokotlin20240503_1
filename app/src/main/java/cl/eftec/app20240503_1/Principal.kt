package cl.eftec.app20240503_1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Principal() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        val cvm= remember { ClienteViewModelo() }
        Greeting(
            name = "Android",
            modifier = Modifier.padding(innerPadding)
        )
        Column {
            ListadoCliente(cvm = cvm)
            FormularioCliente(cvm = cvm)
        }
    }
}