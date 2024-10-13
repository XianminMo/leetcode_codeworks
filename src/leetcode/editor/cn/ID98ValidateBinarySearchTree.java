package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID98ValidateBinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID98ValidateBinarySearchTree().new Solution();
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
	TreeNode pre = null;

	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}

		boolean left = isValidBST(root.left);

		if (pre != null && pre.val >= root.val) {
			return false;
		}
		pre = root;

		boolean right = isValidBST(root.right);

		return left && right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
