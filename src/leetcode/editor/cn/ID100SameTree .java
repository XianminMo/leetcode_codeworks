package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID100SameTree{
	public static void main(String[] args) {
		Solution solution = new ID100SameTree().new Solution();
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q != null) {
			return false;
		} else if (p != null && q == null) {
			return false;
		} else if (p == null && q == null) {
			return true;
		} else if (p.val != q.val) {
			return false;
		}

		// p.val == q.val
		boolean outSide = isSameTree(p.left, q.left);
		boolean inSide = isSameTree(p.right, q.right);

		return outSide && inSide;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
