package com.max.hsu.katacoding

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class HouseRobberSolutionTest {

    private lateinit var houseRobberSolution: HouseRobberSolution

    @Before
    fun setUp() {
        houseRobberSolution = HouseRobberSolution()
    }


    @Test
    fun rob_money_1231() {
        val robMoneyArr = intArrayOf(1, 2, 3, 1)
        val result: Int = houseRobberSolution.rob(robMoneyArr)
        assertEquals(4, result)
    }

    @Test
    fun rob_money_27931() {
        val robMoneyArr = intArrayOf(2, 7, 9, 3, 1)
        val result: Int = houseRobberSolution.rob(robMoneyArr)
        assertEquals(12, result)
    }

    @Test
    fun rob_money_1234() {
        val robMoneyArr = intArrayOf(1, 2, 3, 4)
        val result: Int = houseRobberSolution.rob(robMoneyArr)
        assertEquals(6, result)
    }

    @Test
    fun rob_money_123410273057() {
        val robMoneyArr = intArrayOf(1, 2, 3, 4, 10, 27, 30, 5, 7)
        val result: Int = houseRobberSolution.rob(robMoneyArr)
        assertEquals(51, result)
    }
}