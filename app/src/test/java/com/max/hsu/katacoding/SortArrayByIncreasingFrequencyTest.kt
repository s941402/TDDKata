package com.max.hsu.katacoding

import org.junit.Assert.assertArrayEquals
import org.junit.Before
import org.junit.Test

class SortArrayByIncreasingFrequencyTest {

    private lateinit var sortArrayByIncreasingFrequency : SortArrayByIncreasingFrequencySolution

    @Before
    fun setUp(){
        sortArrayByIncreasingFrequency = SortArrayByIncreasingFrequencySolution()
    }


    @Test
    fun sortArray1122233(){
        val nums = intArrayOf(1,1,2,2,2,3)
        assertArrayEquals(intArrayOf(3,1,1,2,2,2), sortArrayByIncreasingFrequency.frequencySort(nums))
    }


    @Test
    fun sortArray23132(){
        val nums = intArrayOf(2,3,1,3,2)
        assertArrayEquals(intArrayOf(1,3,3,2,2), sortArrayByIncreasingFrequency.frequencySort(nums))
    }

    @Test
    fun `sortArray-11-645-6141`(){
        val nums = intArrayOf(-1,1,-6,4,5,-6,1,4,1)
        assertArrayEquals(intArrayOf(5,-1,4,4,-6,-6,1,1,1), sortArrayByIncreasingFrequency.frequencySort(nums))
    }

}