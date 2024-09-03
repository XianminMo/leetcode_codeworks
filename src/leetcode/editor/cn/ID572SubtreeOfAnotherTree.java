package leetcode.editor.cn;

import com.sun.source.tree.Tree;
import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID572SubtreeOfAnotherTree{
	public static void main(String[] args) {
		Solution solution = new ID572SubtreeOfAnotherTree().new Solution();
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (root == null) {
			return false;
		} else if (subRoot == null) {
			return true;
		}

		boolean left = isSubtree(root.left, subRoot);
		boolean right = isSubtree(root.right, subRoot);

		return left || right || compare(root, subRoot);
    }

	private boolean compare(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot != null) {
			return false;
		} else if (root != null && subRoot == null) {
			return false;
		} else if (root == null && subRoot == null) {
			return true;
		} else if (root.val != subRoot.val) {
			return false;
		}

		boolean left = compare(root.left, subRoot.left);
		boolean right = compare(root.right, subRoot.right);

		return left && right;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
