package com.djx.composerespect.components.layout


import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
fun LazyColumnCom() {
    val list = List(20) { "Item $it" }
    val scope = rememberCoroutineScope()
    val lazyState = rememberLazyListState()
    LazyColumn(state = lazyState) {
        // 单item
//        item {  }
        // 保持头部吸顶
        stickyHeader {
            Text(
                "header Sticker",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Green)
                    .padding(10.dp),
                textAlign = TextAlign.Center
            )
        }
        items(list.size) { index ->
            val it = list[index]
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
//                          lazyState.scrollToItem(10)
                            lazyState.animateScrollToItem(list.size - 1)
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
fun LazyColumnComPreview() {
    LazyColumnCom()
}