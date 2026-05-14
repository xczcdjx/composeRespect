package com.djx.composerespect.state


import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

val shangDan = AAA("吕布")
@Composable
fun StateTest() {
    var name by remember {
        mutableStateOf("111")
    }
    Column() {
        Log.i("TestState", "invoke1 -->1")
        Text("Name $name")
        Button({
            name="222"
            Log.i("name",name)
        }){
            Text("Change name")
        }
        TestState(shangDan)
    }
}
data class AAA(var n: String)

@Composable
fun TestState(c: AAA) {
    Log.i("TestState", "invoke2 -->2")
    Text("name ${c.n}")
}

@Preview
@Composable
fun StateTestPreview() {
    StateTest()
}