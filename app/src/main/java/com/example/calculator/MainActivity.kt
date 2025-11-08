package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.Calculator
import com.CalculatorViewModel
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val calculatorViewModel = ViewModelProvider(this)[CalculatorViewModel::class.java]

        enableEdgeToEdge()
        setContent {
            CalculatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Calculator(modifier =  Modifier.padding(innerPadding), calculatorViewModel)// Llamada a la función composable "Calculator" a la que se le pasa un modificador con un relleno (padding) interno proveniente del Scaffold. Este modificador asegura que el contenido no se superponga con las barras del sistema u otros elementos de la interfaz.

                }
            }
        }
    }
}

