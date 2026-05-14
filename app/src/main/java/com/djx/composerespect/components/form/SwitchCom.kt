package com.djx.composerespect.components.form


import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun SwitchCom() {
    var checked by remember {
        mutableStateOf(false)
    }
    Switch(checked, onCheckedChange = {
        checked = it
    })
}

@Preview
@Composable
fun SwitchComPreview() {
    SwitchCom()
}