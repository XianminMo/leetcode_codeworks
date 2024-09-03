package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID637AverageOfLevelsInBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID637AverageOfLevelsInBinaryTree().new Solution();
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
    public List<Double> averageOfLevels(TreeNode root) {
		if (root == null) {
			return new ArrayList<>(Arrays.asList(0.0));
		}

		List<Double> result = new ArrayList<>();
		Queue<TreeNode> fringe = new LinkedList<>();
		fringe.add(root);

		while (!fringe.isEmpty()) {
			List<Integer> itemList = new ArrayList<>();
			int length = fringe.size();
			double sum = 0.0;

			for (int i = 0; i < length; i++) {
				TreeNode currentNode = fringe.poll();

				sum += currentNode.val;
				if (currentNode.left != null) {
					fringe.add(currentNode.left);
				}
				if (currentNode.right != null) {
					fringe.add(currentNode.right);
				}
			}
			result.add(sum / length);
		}

		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
