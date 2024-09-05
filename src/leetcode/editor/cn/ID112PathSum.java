package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID112PathSum{
	public static void main(String[] args) {
		Solution solution = new ID112PathSum().new Solution();
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null && targetSum == root.val) {
            return true;
        } else if (root.left == null && root.right == null) {
            return false;
        }

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return left || right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
