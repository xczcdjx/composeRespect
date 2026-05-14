package com.djx.composerespect.components.form

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SliderCom(modifier: Modifier = Modifier) {
    var value by remember {
        mutableFloatStateOf(0f)
    }
    Row(modifier.padding(horizontal = 25.dp)) {
        Slider(
            value, {
                value = it
            }, valueRange = 0f..100f,
            //  步长
            steps = 5
        )
    }
    // RangerSlider
    // 范围Slider
    var values by remember {
        mutableStateOf(0.2f..1.0f)
    }
    RangeSlider(values, {
        values = it
    })
}