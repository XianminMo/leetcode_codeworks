package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;


public class ID226InvertBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID226InvertBinaryTree().new Solution();
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
    public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		swapChild(root);

		invertTree(root.left);
		invertTree(root.right);


		return root;
    }

	private void swapChild(TreeNode root) {
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
