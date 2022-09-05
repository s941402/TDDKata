package com.max.hsu.katacoding

import com.max.hsu.katacoding.model.TreeNode
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class BinaryTreeInorderTraversalTest {

    @Test
    fun tree_inorder_traversal_1234567() {
        val tree = TreeNode(1)
        tree.left = TreeNode(2)
        tree.right = TreeNode(3)
        tree.left?.left = TreeNode(4)
        tree.left?.right = TreeNode(5)
        tree.right?.left = TreeNode(6)
        tree.right?.right = TreeNode(7)

        val outputArray = arrayListOf(4, 2, 5, 1, 6, 3, 7)
        assertEquals(
            outputArray,
            BinaryTreeInorderTraversalSolution().inorderTraversal(tree)
        )
    }


    @Test
    fun tree_inorder_traversal_123() {
        val tree = TreeNode(1)
        tree.right = TreeNode(2)
        tree.right?.left = TreeNode(3)

        val outputArray = arrayListOf(1,3,2)
        assertEquals(
            outputArray,
            BinaryTreeInorderTraversalSolution().inorderTraversal(tree)
        )
    }

    @Test
    fun tree_inorder_traversal_empty() {
        val tree : TreeNode? = null
        val outputArray = arrayListOf<Int>()
        assertEquals(
            outputArray,
            BinaryTreeInorderTraversalSolution().inorderTraversal(tree)
        )
    }

    @Test
    fun tree_inorder_traversal_1() {
        val tree = TreeNode(1)

        val outputArray = arrayListOf(1)
        assertEquals(
            outputArray,
            BinaryTreeInorderTraversalSolution().inorderTraversal(tree)
        )
    }

}

