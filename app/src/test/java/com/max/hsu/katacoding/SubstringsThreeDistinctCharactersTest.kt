package com.max.hsu.katacoding

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SubstringsThreeDistinctCharactersTest {

    lateinit var substringsThreeDistinctCharactersSolution: SubstringsThreeDistinctCharactersSolution

    @Before
    fun setUp() {
        substringsThreeDistinctCharactersSolution = SubstringsThreeDistinctCharactersSolution()
    }

    @Test
    fun `test substrings of size three with distinct characters xyzzaz`() {
        val s = "xyzzaz"
        val res: Int = substringsThreeDistinctCharactersSolution.countGoodSubstrings(s)
        val ans = 1
        Assert.assertEquals(ans, res)
    }

    @Test
    fun `test substrings of size three with distinct characters function2 xyzzaz`() {
        val s = "xyzzaz"
        val res: Int = substringsThreeDistinctCharactersSolution.countGoodSubstrings2(s)
        val ans = 1
        Assert.assertEquals(ans, res)
    }

    @Test
    fun `test substrings of size three with distinct characters function2 xy`() {
        val s = "xy"
        val res: Int = substringsThreeDistinctCharactersSolution.countGoodSubstrings2(s)
        val ans = 0
        Assert.assertEquals(ans, res)
    }

    @Test
    fun `test substrings of size three xyzzaz`() {
        val s = "xyzzaz"
        val res: ArrayList<String> =
            substringsThreeDistinctCharactersSolution.substringsThreeCharacters(s)
        val ans = arrayListOf("xyz")
        Assert.assertEquals(ans, res)
    }

    @Test
    fun `test remove repeat characters yzz`() {
        val s = "yzz"
        val res: Boolean =
            substringsThreeDistinctCharactersSolution.isRepeatCharacters(s)
        val ans = true
        Assert.assertEquals(ans, res)
    }

    @Test
    fun `test remove repeat characters xyz`() {
        val s = "xyz"
        val res: Boolean =
            substringsThreeDistinctCharactersSolution.isRepeatCharacters(s)
        val ans = false
        Assert.assertEquals(ans, res)
    }
}