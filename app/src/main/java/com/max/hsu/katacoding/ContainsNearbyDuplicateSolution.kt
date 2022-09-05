package com.max.hsu.katacoding

class ContainsNearbyDuplicateSolution {


    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            map[num]?.let {
                if(index - it <= k) return true
            }
            map[num] = index
        }
        return false
    }
}
