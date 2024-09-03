package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.TreeNode;
public class ID104MaximumDepthOfBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID104MaximumDepthOfBinaryTree().new Solution();
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
    public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null) {
			return maxDepth(root.right) + 1;
		} else if (root.right == null) {
			return maxDepth(root.left) + 1;
		} else {
			return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
