package com.max.hsu.katacoding


import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ClimbingStairsSolutionTest {

    private lateinit var climbingStairsSolution: ClimbingStairsSolution

    @Before
    fun setUp() {
        climbingStairsSolution = ClimbingStairsSolution()
    }

    @Test
    fun climb_a_floor_ways() {
        assertEquals(1,  climbingStairsSolution.climbStairs(1))
    }

    @Test
    fun climb_2_floor_ways() {
        assertEquals(2,  climbingStairsSolution.climbStairs(2))
    }

    @Test
    fun climb_3_floor_ways() {
        assertEquals(3,  climbingStairsSolution.climbStairs(3))
    }

    @Test
    fun climb_4_floor_ways() {
        assertEquals(5,  climbingStairsSolution.climbStairs(4))
    }

    @Test
    fun climb_45_floor_ways() {
        assertEquals(1836311903,  climbingStairsSolution.climbStairs(45))
    }
}