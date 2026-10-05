package eus.joel.puntuenkontadorea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MarcadorScreen()
        }
    }
}

@Composable
fun MarcadorScreen(
    marcadorViewModel: MarcadorViewModel = viewModel()
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "MARKADOREA",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(50.dp)
        ) {

            // EQUIPO A
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "A TALDEA",
                    fontSize = 22.sp
                )

                Text(
                    text = "${marcadorViewModel.puntosA.intValue}",
                    fontSize = 50.sp
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    Button(
                        onClick = {
                            marcadorViewModel.restarA()
                        }
                    ) {
                        Text("-1")
                    }

                    Button(
                        onClick = {
                            marcadorViewModel.sumarA()
                        }
                    ) {
                        Text("+1")
                    }
                }
            }

            // EQUIPO B
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "B TALDEA",
                    fontSize = 22.sp
                )

                Text(
                    text = "${marcadorViewModel.puntosB.intValue}",
                    fontSize = 50.sp
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    Button(
                        onClick = {
                            marcadorViewModel.restarB()
                        }
                    ) {
                        Text("-1")
                    }

                    Button(
                        onClick = {
                            marcadorViewModel.sumarB()
                        }
                    ) {
                        Text("+1")
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = {
                marcadorViewModel.reset()
            }
        ) {
            Text("RESET")
        }
    }
}