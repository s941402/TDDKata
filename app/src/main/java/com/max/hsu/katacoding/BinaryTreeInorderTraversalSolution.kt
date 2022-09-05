package com.max.hsu.katacoding

import com.max.hsu.katacoding.model.TreeNode
import java.util.*
import kotlin.collections.ArrayList

class BinaryTreeInorderTraversalSolution {

    fun inorderTraversal(root: TreeNode?): List<Int> {
//        val list = arrayListOf<Int>()
//        dfs(root, list)
        return bfs(root)
    }

    private fun dfs(root: TreeNode?, list: ArrayList<Int>) {
        if (root == null) return
        dfs(root.left, list)
        list.add(root.`val`)
        dfs(root.right,list)
    }

    private fun bfs(root: TreeNode?) : ArrayList<Int> {
        val list = arrayListOf<Int>()
        val stack = Stack<TreeNode>()
        var curr = root
        while (curr != null || !stack.isEmpty()){
            while (curr!= null){
                stack.push(curr)
                curr = curr.left
            }
            curr = stack.pop()
            list.add(curr.`val`)
            curr = curr.right
        }
        return list
    }
}
