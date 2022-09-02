package com.max.hsu.katacoding

class RangeExtractionSolution {

    fun rangeExtraction(arr: IntArray): String {
        val groupNumberList = groupContinuousNumbers(arr)
        return combineContinueNumber(groupNumberList)
    }

    fun groupContinuousNumbers(arr: IntArray): ArrayList<ArrayList<Int>> {
        val result = arrayListOf<ArrayList<Int>>()
        var i = 0
        while (i in arr.indices) {
            val newArray = arrayListOf<Int>()
            newArray.add(arr[i])
            var j = i + 1
            while (j < arr.size && arr[j] == arr[j - 1] + 1) {
                newArray.add(arr[j])
                j++
            }
            result.add(newArray)
            i = j
        }
        return result
    }

    private fun combineContinueNumber(arr: ArrayList<ArrayList<Int>>): String {
        val sb = StringBuilder()
        arr.forEachIndexed { index, it ->
            if (it.size >= 3) {
                sb.append("${it[0]}-${it[it.size - 1]}")
            } else {
                sb.append(it.joinToString(","))
            }
            if (index != arr.size - 1) sb.append(",")
        }
        return sb.toString()
    }
}