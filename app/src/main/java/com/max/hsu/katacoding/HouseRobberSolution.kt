package com.max.hsu.katacoding

class HouseRobberSolution {

    /** dp定義為最大搶劫量，搶了第i - 1個住戶，就不能搶第i個
     *  dp[i] = max(dp[i-2]+dp[i],dp[i-1])
     * */
    fun rob(nums: IntArray): Int {
        var prev2 = 0
        var prev1 = 0
        for (element in nums) {
            val curr = Math.max(prev2 + element, prev1)
            prev2 = prev1
            prev1 = curr
        }
        return prev1
    }

}
