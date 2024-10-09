package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID106ConstructBinaryTreeFromInorderAndPostorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID106ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || postorder == null || inorder.length != postorder.length) {
			return null;
		}
		return buildTreeHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

	private TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
		if (inStart > inEnd || postStart > postEnd) {
			return null;
		}

		int rootVal = postorder[postEnd];
		TreeNode root = new TreeNode(rootVal);

		int rootIndex = 0;
		while (rootIndex <= inEnd && inorder[rootIndex] != rootVal) {
			rootIndex++;
		}

		int leftSubTreeSize = rootIndex - inStart;

		root.left = buildTreeHelper(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSubTreeSize - 1);
		root.right = buildTreeHelper(inorder, rootIndex + 1, inEnd, postorder, postStart + leftSubTreeSize, postEnd - 1);

		return root;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
