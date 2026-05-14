package com.djx.composerespect.components.base


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.djx.composerespect.R


@Composable
fun ImageCom() {
    Image(
        painterResource(R.drawable.rate),
        null,
        modifier = Modifier.size(120.dp),
        // 裁剪方式
        contentScale = ContentScale.Crop,
        // 滤镜
        colorFilter = ColorFilter.tint(Color.Red, blendMode = BlendMode.Color),
        alignment = Alignment.TopEnd
    )
}

@Preview
@Composable
fun ImageComPreview() {
    ImageCom()
}