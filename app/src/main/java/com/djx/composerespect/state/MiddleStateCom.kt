package com.djx.composerespect.state


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import kotlin.collections.mutableListOf


@Composable
fun MiddleStateCom() {
    /*var nums by remember {
        mutableStateOf(mutableListOf(1, 3, 5))
    }

    fun add() {
        val newNums = nums.toMutableList()
        newNums.add(nums.last() + 2)
        nums = newNums
    }*/
    // 简化
    val nums = remember {
        mutableStateListOf(1, 3, 5)
    }
    // derivedStateOf 缓存依赖
    val numsLen by remember {
        derivedStateOf {
            nums.size
        }
    }

    fun add() {
        nums += nums.last() + 2
    }
    Button({
        add()
    }) {
        Text("num Length $numsLen")
        Text(" ")
        Text("list item add +")
    }
    nums.forEach {
        Text("item -> $it")
    }

    val heroList = remember {
        mutableStateListOf(Hero(1, name = "安其拉", age = 18), Hero(2, name = "鲁班", age = 19))
    }
    Button(onClick = {
        /*val n=heroList.map {
            if (it.id==1) Hero(1,"AAA",22)
            else it
        }
        heroList.clear()
        heroList.addAll(n)*/
        // 使用copy
        /*val index=heroList.indexOfFirst { it.id==1 }
        if (index!=-1) heroList[index]=heroList[index].copy(name = "AAA", age = 22)*/
        // 使用replaceAll
        heroList.replaceAll {
            if (it.id == 1) it.copy(name = "AAA", age = 22)
            else it
        }
    }) {
        Text(text = "test click")
    }

    heroList.forEach {
        Text(text = "student, id: ${it.id}, name: ${it.name}, age: ${it.age} ")
    }
}

data class Hero(val id: Int, var name: String, var age: Int)

@Preview
@Composable
fun MiddleStateComPreview() {
    MiddleStateCom()
}