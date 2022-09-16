package com.max.hsu.katacoding

class ClimbingStairsSolution {

    /*
    * dp動態規劃題 ；
    * dp[i] = dp[i - 1] + dp[i - 2]
    * */
    fun climbStairs(n: Int): Int {
        return saveWithTwoVariablesStairs(n)
    }

    // time：O(N) space：O(1)
    private fun saveWithTwoVariablesStairs(stairs : Int) : Int{
        if(stairs <= 2) return stairs
        var prev1 = 1
        var prev2 = 2
        for(i in 2 until stairs){
            val curr = prev1 + prev2
            prev1 = prev2
            prev2 = curr
        }
        return prev2
    }

    // Time Limit Exceeded
    private fun recursiveStairs(stairs : Int) : Int{
        if (stairs == 1) {
            return 1
        } else if (stairs == 2) {
            return 2
        }
        return recursiveStairs(stairs - 1) + recursiveStairs(stairs - 2)
    }
}
