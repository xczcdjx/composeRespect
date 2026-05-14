package com.djx.composerespect.components


import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun BtnCom() {
    // 普通按钮
    Button({
        Log.i("btn","button")
    }, colors = ButtonDefaults.buttonColors(containerColor = Color.Red)) {
        Text("btn")
    }
    // 文本按钮
    TextButton({
        Log.i("btn","textButton")
    }) {
        Text("aaaa")
    }
    // 边框按钮
    OutlinedButton({

    }, border = BorderStroke(1.dp,Color(255,125,125))) {
        Text("ddddd")
    }
}

@Preview
@Composable
fun BtnComPreview() {
    BtnCom()
}