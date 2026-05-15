package com.djx.composerespect.components.form


import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun RadioBtnCom() {
    // 单选框
    /*var radio by remember {
        mutableStateOf(false)
    }
    RadioButton(radio, {
        radio = !radio
    })*/
    /*val radioList = remember {
        mutableStateListOf(SexCls("男", true), SexCls("女", false))
    }
    radioList.forEach { r ->
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(r.f, {
                radioList.replaceAll {
                    if (it.t==r.t) it.copy(f=true)
                    else it.copy(f=false)
                }
            })
            Text(r.t)
        }
    }*/
    val radioList = listOf("男", "女")
    var rSex by remember {
        mutableStateOf("男")
    }
    radioList.forEach { r ->
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(r == rSex, {
                rSex = r
            })
            Text(r)
        }
    }
}

data class SexCls(val t: String, var f: Boolean)

@Preview
@Composable
fun RadioBtnComPreview() {
    RadioBtnCom()
}