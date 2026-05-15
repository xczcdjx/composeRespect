package com.djx.composerespect.components.form


import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun CheckBtnCom() {
    val radioList = remember {
        mutableStateListOf(SexCls("A", true), SexCls("B", false), SexCls("C", false))
    }
    radioList.forEach { r ->
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(r.f, {
                val index = radioList.indexOfFirst { it.t == r.t }
                if (index != -1) radioList[index] = radioList[index].copy(f = !r.f)
            })
            Text(r.t)
        }
    }
}

@Preview
@Composable
fun CheckBtnComPreview() {
    CheckBtnCom()
}