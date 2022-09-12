package com.max.hsu.katacoding

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class BowlingGameTest : TestCase() {

    private lateinit var game: Game

    @Before
    override fun setUp() {
        game = Game()
    }

    private fun rollTimesAndPins(times: Int, pins: Int) {
        for (i in 0 until times) {
            game.roll(pins)
        }
    }

    @Test
    fun testGutterGame() {
        rollTimesAndPins(20, 0)
        assertEquals(0, game.score())
    }

    @Test
    fun testAllOnes() {
        rollTimesAndPins(20, 1)
        assertEquals(20, game.score())
    }


//    @Test
//    fun testOneSpare() {
//        game.roll(5)
//        game.roll(5) // spare
//        game.roll(3)
//        rollTimesAndPins(17, 0)
//        assertEquals(16, game.score())
//    }
}