package com.djx.composerespect.components.layout

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxCom(modifier: Modifier = Modifier) {
    // 排列方式
    Box(contentAlignment = Alignment.Center) {
        Box(
            modifier = modifier
                .size(200.dp)
                .background(Color.Red)
        )
        Box(
            modifier = modifier
                .size(150.dp)
                .background(Color.Green)
                // 子组件单独排列
                .align(Alignment.TopStart)
        )
        Box(
            modifier = modifier
                .size(100.dp)
                .background(Color.Blue)
        )
    }
    // 带最大宽高Box
    BoxWithConstraints() {
        val w = maxWidth
        val h = maxHeight
        if (w > h) Box(
            modifier = modifier
                .size(150.dp)
                .background(Color.Green)
                // 子组件单独排列
                .align(Alignment.TopStart)
        ) else Box(
            modifier = modifier
                .size(100.dp)
                .background(Color.Blue)
        )
    }
}