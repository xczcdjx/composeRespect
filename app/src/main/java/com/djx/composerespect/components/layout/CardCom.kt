package com.djx.composerespect.components.layout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardCom(modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.Green, contentColor = Color.Red),
        border = BorderStroke(1.dp, Color.Red),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Text("1111",modifier= modifier.padding(10.dp))
    }
}