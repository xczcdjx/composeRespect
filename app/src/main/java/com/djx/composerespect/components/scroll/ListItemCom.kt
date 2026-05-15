package com.djx.composerespect.components.scroll


import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
fun ListItemCom() {
    val list = List(20) { "Item $it" }
    val scrollState = rememberScrollState()
    val scope = rememberCoroutineScope()
    // 该方式滚动数据也会全部渲染
    Column(modifier = Modifier.verticalScroll(scrollState)) {
        list.forEach {
            ListItem(
                // 必传 (主标题)
                headlineContent = {
                    Text(it)
                },
                // (左图标)
                leadingContent = {
                    Icon(Icons.Default.AccountBox, null, modifier = Modifier.size(30.dp))
                },
                // 主标题上
                overlineContent = {
                    Text("overText")
                },
                // 副标题
                supportingContent = {
                    Text("support content", modifier = Modifier.clickable {
                        scope.launch {
                            // 滚动到指定位置
//                            scrollState.scrollTo(scrollState.maxValue)
                            // 当前距离再滚动
                            scrollState.scrollBy(100f)
                            // 带动画方式滚动
//                            scrollState.animateScrollTo(scrollState.maxValue)
//                            scrollState.animateScrollBy(500f)
                        }
                    })
                },
                // 最右侧
                trailingContent = {
                    Text("trailling")
                }
            )
            // 生命周期
            DisposableEffect(Unit) {
                Log.d("====", "effect:$it")
                onDispose {
                    Log.d("====", "onDispose:$it")
                }
            }
        }
    }
}

@Preview
@Composable
fun ListItemComPreview() {
    ListItemCom()
}