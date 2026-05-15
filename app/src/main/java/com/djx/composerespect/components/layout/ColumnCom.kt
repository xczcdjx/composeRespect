package com.djx.composerespect.components.layout


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ColumnCom() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 设置比重值
        Text("111", modifier = Modifier.weight(2f))
        Text("222", modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
fun ColumnComPreview() {
    ColumnCom()
}