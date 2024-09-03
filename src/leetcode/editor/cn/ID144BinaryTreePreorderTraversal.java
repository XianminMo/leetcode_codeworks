package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.TreeNode;
public class ID144BinaryTreePreorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID144BinaryTreePreorderTraversal().new Solution();
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
    public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		preorder(root, result);
		return result;
    }

	private void preorder(TreeNode root, List<Integer> result){
		if (root == null) {
			return;
		}

		result.add(root.val);
		preorder(root.left, result);
		preorder(root.right, result);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
