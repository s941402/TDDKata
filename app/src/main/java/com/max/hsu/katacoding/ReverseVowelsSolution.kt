package com.max.hsu.katacoding

class ReverseVowelsSolution {

    fun reverseVowels(s: String): String {
        val cArr = s.toCharArray()
        var start = 0
        var end = s.length - 1

        while (start < end){
            if(isEqualsVowels(cArr[start]) && isEqualsVowels(cArr[end])){
                val tmp = cArr[start]
                cArr[start] = cArr[end]
                cArr[end] = tmp
                start++
                end--
            }else if(!isEqualsVowels(cArr[start]) && isEqualsVowels(cArr[end]) ){
                start++
            }else if(isEqualsVowels(cArr[start]) && !isEqualsVowels(cArr[end]) ){
                end--
            }else{
                start++
                end--
            }
        }
        return cArr.joinToString("")
    }

//    fun reverseVowels(s: String): String {
//        val cArr = s.toCharArray()
//        var start = 0
//        var end = s.length - 1
//
//        while (start < end){
//            while (start < end && !isEqualsVowels(cArr[start])) start++
//            while (start < end && !isEqualsVowels(cArr[end])) end--
//            val tmp = cArr[start]
//            cArr[start] = cArr[end]
//            cArr[end] = tmp
//            start++
//            end--
//        }
//        return cArr.joinToString("")
//    }

    fun isEqualsVowels(c: Char): Boolean {
        return when (c.lowercaseChar()) {
            'a', 'e', 'i', 'o', 'u' -> true
            else -> false
        }
    }
}
