package leetcode.editor.cn;

import com.sun.source.tree.Tree;
import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID236LowestCommonAncestorOfABinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID236LowestCommonAncestorOfABinaryTree().new Solution();
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
        if (root == q || root == p || root == null) return root;
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		if (left != null && right != null) return root;
		if (left == null) return right;

		return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
