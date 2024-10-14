package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID530MinimumAbsoluteDifferenceInBst{
	public static void main(String[] args) {
		Solution solution = new ID530MinimumAbsoluteDifferenceInBst().new Solution();
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
    int result = Integer.MAX_VALUE;
	TreeNode pre = null;

	public int getMinimumDifference(TreeNode root) {
		if (root == null) return 0;
		traversal(root);
		return result;
    }

	private void traversal(TreeNode root) {
		if (root == null) return;
		traversal(root.left);

		if (pre != null) {
			result = Math.min(root.val - pre.val, result);
		}
		pre = root;

		traversal(root.right);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
