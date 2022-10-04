package com.max.hsu.katacoding

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ReverseVowelsTest {

    private lateinit var reverseVowelsSolution: ReverseVowelsSolution

    @Before
    fun setUp() {
        reverseVowelsSolution = ReverseVowelsSolution()
    }

    @Test
    fun test_isEqualsVowels_a() {
        val word = 'a'
        val ans = true
        Assert.assertEquals(
            ans,
            reverseVowelsSolution.isEqualsVowels(word)
        )
    }

    @Test
    fun test_isEqualsVowels_d() {
        val word = 'd'
        val ans = false
        Assert.assertEquals(
            ans,
            reverseVowelsSolution.isEqualsVowels(word)
        )
    }


    @Test
    fun test_reverseVowels_hello_to_holle() {
        val word = "hello"
        val ans = "holle"
        Assert.assertEquals(
            ans,
            reverseVowelsSolution.reverseVowels(word)
        )
    }


    @Test
    fun test_reverseVowels_leetcode_to_leotcede() {
        val word = "leetcode"
        val ans = "leotcede"
        Assert.assertEquals(
            ans,
            reverseVowelsSolution.reverseVowels(word)
        )
    }

    @Test
    fun test_reverseVowels_aA_to_Aa() {
        val word = "aA"
        val ans = "Aa"
        Assert.assertEquals(
            ans,
            reverseVowelsSolution.reverseVowels(word)
        )
    }

}