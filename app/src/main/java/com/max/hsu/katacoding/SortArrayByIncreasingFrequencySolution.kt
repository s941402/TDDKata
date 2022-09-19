package com.max.hsu.katacoding

class SortArrayByIncreasingFrequencySolution {

    fun frequencySort(nums: IntArray): IntArray {
        val map = hashMapOf<Int, Int>()
        nums.forEach {
            val count = map.getOrDefault(it, 1)
            map[it] = count + 1
        }
        val list = nums.toMutableList().sortedWith(compareBy<Int> { map[it] ?: 0 }.thenByDescending { it })

        return list.toIntArray()
    }

}
