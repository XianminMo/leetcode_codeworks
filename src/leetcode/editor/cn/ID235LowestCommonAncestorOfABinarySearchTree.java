package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID235LowestCommonAncestorOfABinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID235LowestCommonAncestorOfABinarySearchTree().new Solution();
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
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestor(root.left, p, q);
		}
		else if (root.val < p.val && root.val < q.val) {
			return lowestCommonAncestor(root.right, p, q);
		} else {
			return root;
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
