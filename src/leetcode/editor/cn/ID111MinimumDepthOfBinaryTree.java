package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID111MinimumDepthOfBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID111MinimumDepthOfBinaryTree().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null) {
			return minDepth(root.right) + 1;
		} else if (root.right == null) {
			return minDepth(root.left) + 1;
		} else {
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
