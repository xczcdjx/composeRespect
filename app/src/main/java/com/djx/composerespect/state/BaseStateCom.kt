package com.djx.composerespect.state


import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BaseStateCom() {
//    var count: Int=0
    // 可观察对象
    val count = remember {
        mutableStateOf(0)
    }
    var count2 by remember {
        mutableIntStateOf(0)
    }
    // 重新创建Activity或进程后，可恢复 例如横屏
    val (c3, setC3) = rememberSaveable {
        mutableIntStateOf(0)
    }
    TextButton({
        count.value += 1
        count2 += 1
        setC3(c3 + 2)
        Log.d("aaaa", "${count.value}")
    }) {
        Text("count ${count.value}")
        Text("  ")
        Text("count2 $count2")
        Text("  ")
        Text("count3 $c3")
    }
}

@Preview
@Composable
fun BaseStateComPreview() {
    BaseStateCom()
}