package com.max.hsu.katacoding

import org.junit.Assert.assertEquals
import org.junit.Test

class RangeExtractionSolutionTest {
    @Test
    fun basicTests() {
        assertEquals("1,3,5,7,9", RangeExtractionSolution().rangeExtraction(intArrayOf(1, 3, 5, 7, 9)))
    }

    @Test
    fun `No match Range 1 3 5 7 9`() {
        assertEquals("1,3,5,7,9", RangeExtractionSolution().rangeExtraction(intArrayOf(1, 3, 5, 7, 9)))
    }

    @Test
    fun `No match Range n4 n2 2 4 6`() {
        assertEquals("-4,-2,2,4,6", RangeExtractionSolution().rangeExtraction(intArrayOf(-4, -2, 2, 4, 6)))
    }

    @Test
    fun `group continuous 1 2 3 5 7`() {
        val answerList = RangeExtractionSolution().groupContinuousNumbers(intArrayOf(1, 2, 3, 5, 7))
        assertEquals(arrayListOf(1, 2, 3), answerList[0])
        assertEquals(arrayListOf(5), answerList[1])
        assertEquals(arrayListOf(7), answerList[2])
    }

    @Test
    fun `group continuous 1 2 3 5 7 8 9`() {
        val answerList = RangeExtractionSolution().groupContinuousNumbers(intArrayOf(1, 2, 3, 5, 7, 8, 9))
        assertEquals(arrayListOf(1, 2, 3), answerList[0])
        assertEquals(arrayListOf(5), answerList[1])
        assertEquals(arrayListOf(7,8,9), answerList[2])
    }

    @Test
    fun `match Range 0 1 2 5 9`() {
        assertEquals("0-2,5,9", RangeExtractionSolution().rangeExtraction(intArrayOf(0, 1, 2, 5, 9)))
    }

    @Test
    fun `match Range -6,-3-1,3-5,7-11,14,15,17-20`() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", RangeExtractionSolution().rangeExtraction(intArrayOf(-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20)))
    }

    @Test
    fun `match Range -3--1,2,10,15,16,18-20`() {
        assertEquals("-3--1,2,10,15,16,18-20", RangeExtractionSolution().rangeExtraction(intArrayOf(-3, -2, -1, 2, 10, 15, 16, 18, 19, 20)))
    }
}