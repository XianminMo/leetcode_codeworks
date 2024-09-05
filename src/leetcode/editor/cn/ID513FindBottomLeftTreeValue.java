package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID513FindBottomLeftTreeValue{
	public static void main(String[] args) {
		Solution solution = new ID513FindBottomLeftTreeValue().new Solution();
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
    private int maxDepth = Integer.MIN_VALUE;
	private int leftValue = 0;

	public int findBottomLeftValue(TreeNode root) {
		int depth = 0;
		findLeftValue(root, depth);
		return leftValue;
    }

	private void findLeftValue(TreeNode root, int depth) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			if (depth > maxDepth) {
				maxDepth = depth;
				leftValue = root.val;
			}
			return;
        }

		if (root.left != null) findLeftValue(root.left, depth + 1);
		if (root.right != null) findLeftValue(root.right, depth + 1);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
