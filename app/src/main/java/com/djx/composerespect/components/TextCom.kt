package com.djx.composerespect.components

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.sp
import com.djx.composerespect.R
import org.xmlpull.v1.sax2.Driver

@Composable
fun TextCom() {
    // 文字大小使用TextUnit构造函数
    // 长按复制操作
    SelectionContainer() {
        Text(
            "111123", fontSize = TextUnit(16f, TextUnitType.Sp),
            color = Color(255, 122, 122), modifier = Modifier.clickable {
                Log.d("=====", "111123")
            })
    }
    // 可点击文本
    ClickableText(buildAnnotatedString {
        append("JetPack")
        append(" ")
        withStyle(
            SpanStyle(
                color = Color.Green
            )
        ) {
            append("Compose")
        }
        append(" ")
        append("Xxx")
    }) {
        Log.d("=====", "aaaa")
    }
    // 静态资源文件夹
    Text(
        stringResource(R.string.textStr),
        color = Color(255, 0, 255),
        fontSize = 20.sp,
        letterSpacing = 10.sp,
        // 下划线加删除线
        textDecoration = TextDecoration.combine(
            listOf(
                TextDecoration.Underline, TextDecoration.LineThrough
            )
        ),
        lineHeight = 50.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        style = TextStyle(color = Color.Blue, textIndent = TextIndent(10.sp))
    )
    UserProtocal()
}

@Composable
fun UserProtocal() {
    val annoation = buildAnnotatedString {
        append("点击同意")
        pushStringAnnotation("key", "protocal")
        withStyle(SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
            append("点击同意")
        }
        pop()
        append("和")
        pushStringAnnotation("key", "privacy")
        withStyle(SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
            append("隐私政策")
        }
        pop()
    }
    Driver()
    ClickableText(annoation) {
        annoation.getStringAnnotations("key", start = it, end = it).firstOrNull()?.let { key ->
            when (key.item) {
                "protocal" ->
                    Log.d("=====AAA", "http")

                "privacy" ->
                    Log.d("=====AAA", "proto")
            }
        }
    }
}