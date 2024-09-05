package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID113PathSumIi{
	public static void main(String[] args) {
		Solution solution = new ID113PathSumIi().new Solution();
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
    private List<List<Integer>> paths = new ArrayList<>();
	private List<Integer> path = new ArrayList<>();

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return new ArrayList<>();
		}
		traversal(root, targetSum);
		return paths;
    }

	private void traversal(TreeNode root, int targetSum) {
		path.add(root.val);
		if (root.left == null && root.right == null && targetSum == root.val) {
			 paths.add(new ArrayList<>(path));
			 return;
		}
		if (root.left == null && root.right == null) {
			return;
		}

		if (root.left != null) {
			 traversal(root.left, targetSum - root.val);
			 path.remove(path.size() - 1);
		 }

		if (root.right != null) {
			traversal(root.right, targetSum - root.val);
			path.remove(path.size() - 1);
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
