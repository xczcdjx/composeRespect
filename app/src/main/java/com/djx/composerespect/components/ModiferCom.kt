package com.djx.composerespect.components


import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ModiferCom() {
    Text(
        text = "Running up the hill", modifier = Modifier
            .border(1.dp, Color.Green)
            .padding(10.dp) // background 外边距
            .border(1.dp, Color.Red)
            .background(Color.Yellow)
            .padding(8.dp) // 内边距
            .offset(5.dp,10.dp) // transform
            .clickable {
                Log.i("-----","aaaa")
            }
    )
}

@Preview
@Composable
fun ModiferComPreview() {
    ModiferCom()
}