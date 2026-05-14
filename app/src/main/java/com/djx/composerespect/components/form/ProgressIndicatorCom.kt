package com.djx.composerespect.components.form


import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ProgressIndicatorCom() {
    // 新版progress使用lambda
    CircularProgressIndicator(
        color = Color.Blue,
        progress = 0.5f
    )
    LinearProgressIndicator(
        color = Color.Black,
        trackColor = Color.Blue,
        progress = { 0.3f }
    )
}

@Preview
@Composable
fun ProgressIndicatorComPreview() {
    ProgressIndicatorCom()
}