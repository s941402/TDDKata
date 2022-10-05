package com.max.hsu.katacoding

class SubstringsThreeDistinctCharactersSolution {
    fun countGoodSubstrings(s: String): Int {
        return substringsThreeCharacters(s).size
    }

    fun countGoodSubstrings2(s: String): Int {
        var count = 0
        for (i in 0 until s.length - 2) {
            val first = s[i]
            val second = s[i + 1]
            val third = s[i + 2]
            if(first != second && second!= third && first!= third){
                count++
            }
        }
        return count
    }

    fun substringsThreeCharacters(s: String): ArrayList<String> {
        val arr = arrayListOf<String>()
        var start = 0
        var end = 3
        while (end <= s.length) {
            val str = s.substring(start, end)
            if (!isRepeatCharacters(str)) {
                arr.add(str)
            }
            start++
            end++
        }
        return arr
    }

    fun isRepeatCharacters(str: String): Boolean {
        val set = mutableSetOf<Char>()
        for (i in str.indices) {
            if (set.contains(str[i])) {
                return true
            } else {
                set.add(str[i])
            }
        }
        return false
    }

}
