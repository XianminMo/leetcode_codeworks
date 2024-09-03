package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID107BinaryTreeLevelOrderTraversalIi{
	public static void main(String[] args) {
		Solution solution = new ID107BinaryTreeLevelOrderTraversalIi().new Solution();
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
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> fringe = new LinkedList<>();
		fringe.add(root);

		while (!fringe.isEmpty()) {
			List<Integer> itemList = new ArrayList<>();
			int length = fringe.size();

			for (int i = 0; i < length; i++) {
				TreeNode currentNode = fringe.poll();
				itemList.add(currentNode.val);
				if (currentNode.left != null) {
					fringe.add(currentNode.left);
				}
				if (currentNode.right != null) {
					fringe.add(currentNode.right);
				}
			}
			result.add(itemList);
		}

		Collections.reverse(result);

		return result;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
