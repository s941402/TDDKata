package com.max.hsu.katacoding

import org.junit.Assert
import org.junit.Test

class ContainsNearbyDuplicateTest {

    @Test
    fun basicTests() {
        Assert.assertEquals(
            true,
            ContainsNearbyDuplicateSolution().containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3)
        )
        Assert.assertEquals(
            true,
            ContainsNearbyDuplicateSolution().containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1)
        )
        Assert.assertEquals(
            false,
            ContainsNearbyDuplicateSolution().containsNearbyDuplicate(
                intArrayOf(1, 2, 3, 1, 2, 3),
                2
            )
        )
    }
}