package com.max.hsu.katacoding

class Game {

    private val rolls = Array(21) { 0 }
    private var currentRoll = 0

    fun roll(pins: Int) {
        rolls[currentRoll++] = pins
    }

    fun score(): Int {
        var score = 0
        for (i in rolls.indices) {
            score += rolls[i]
        }
        return score
    }

}
