package com.djx.composerespect.components.form


import android.graphics.drawable.Icon
import android.util.Log
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun TextFieldCom() {
    var value by remember {
        mutableStateOf("")
    }
    TextField(
        value,
        onValueChange = {
            value = it
        },
        label = {
            Text("姓名")
        },
        placeholder = {
            Text("请输入姓名")
        },
        leadingIcon = {
            Icon(Icons.Default.AccountBox,null)
        },
        keyboardActions = KeyboardActions(
            onDone = {
//                Log.i("done","111111")
            }
        ),
        singleLine = true,
        // 键盘模式 (imeAction会触发KeyboardActions定义的函数)
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done, keyboardType = KeyboardType.Number)
    )
    // 带边框Field
    OutlinedTextField(value,{
        value=it
    })
    // 基本组件
    BasicTextField(value,{
        value=it
    })
}

@Preview
@Composable
fun TextFieldComPreview() {
    TextFieldCom()
}