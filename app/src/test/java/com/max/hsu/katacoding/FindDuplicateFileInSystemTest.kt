package com.max.hsu.katacoding

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class FindDuplicateFileInSystemTest {

    private lateinit var findDuplicateFileInSystem: FindDuplicateFileInSystemSolution

    @Before
    fun setUp() {
        findDuplicateFileInSystem = FindDuplicateFileInSystemSolution()
    }

    /* 步驟一 先用" "去切分path String*/
    @Test
    fun spiltStringWithSpaceTest() {
        val inputStr = "root/a 1.txt(abcd) 2.txt(efgh)"
        assertEquals(
            listOf("root/a", "1.txt(abcd)", "2.txt(efgh)"),
            findDuplicateFileInSystem.spiltPathStringWithSpace(inputStr)
        )
    }

    /* 步驟二 用(內容)文字去切分個別String 存進map當key value則是用路徑去組合*/
    @Test
    fun spiltContentToCreateMapTest() {
        val spiltPathString = arrayOf("root/a 1.txt(abcd) 2.txt(efgh)")
        assertEquals(
            mapOf("abcd" to listOf("root/a/1.txt"), "efgh" to listOf("root/a/2.txt")),
            findDuplicateFileInSystem.spiltContentToCreateMap(spiltPathString)
        )
    }

    @Test
    fun mutableSpiltStringWithSpaceTest() {
        val spiltPathString = arrayOf(
            "root/a 1.txt(abcd) 2.txt(efgh)",
            "root/c 3.txt(abcd)",
            "root/c/d 4.txt(efgh)",
            "root 4.txt(efgh)"
        )
        val answer = hashMapOf(
            "abcd" to listOf("root/a/1.txt", "root/c/3.txt"),
            "efgh" to listOf("root/a/2.txt", "root/c/d/4.txt", "root/4.txt")
        )
        assertEquals(answer, findDuplicateFileInSystem.spiltContentToCreateMap(spiltPathString))
    }

    /* 步驟三把map分組回傳即可(需要去除只有單一的項目)*/
    @Test
    fun groupSameContentMutableItemArrayTest() {
        val inputMap = hashMapOf(
            "abcd" to listOf("root/a/1.txt", "root/c/3.txt"),
            "efgh" to listOf("root/a/2.txt", "root/c/d/4.txt", "root/4.txt")
        )
        val answer =
            listOf(listOf("root/a/2.txt", "root/c/d/4.txt"), listOf("root/a/1.txt", "root/c/3.txt"))
        assertEquals(answer, findDuplicateFileInSystem.groupSameContentMutableItemArray(inputMap))
    }


    @Test
    fun findDuplicateTest() {
        val paths =
            arrayOf("root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)")
        val answer =
            listOf(listOf("root/a/2.txt", "root/c/d/4.txt"), listOf("root/a/1.txt", "root/c/3.txt"))
        assertEquals(answer, findDuplicateFileInSystem.findDuplicate(paths))
    }
}