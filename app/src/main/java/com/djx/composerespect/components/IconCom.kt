package com.djx.composerespect.components


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.djx.composerespect.R


@Composable
fun IconCom() {
    Icon(Icons.Default.Translate, null)
    // painter 导入资源
    Icon(painter = painterResource(R.drawable.ic_launcher_foreground), null)
    IconButton({

    }) {
        Icon(Icons.Default.AccountBox,null)
    }
}

@Preview
@Composable
fun IconComPreview() {
    IconCom()
}