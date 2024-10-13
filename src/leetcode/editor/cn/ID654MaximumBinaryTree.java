package leetcode.editor.cn;

import com.sun.source.tree.Tree;
import leetcode.editor.util.TreeNode;

public class ID654MaximumBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID654MaximumBinaryTree().new Solution();
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
    // 左闭右开
	private TreeNode traversal(int[] nums, int left, int right) {
		if (left >= right) {
			return null;
		}

		int maxValIndex = left;
		for (int i = left + 1; i < right; i++){
			if (nums[i] > nums[maxValIndex]) {
				maxValIndex = i;
			}
		}

		TreeNode root = new TreeNode(nums[maxValIndex]);

		root.left = traversal(nums, left, maxValIndex);
		root.right = traversal(nums, maxValIndex + 1, right);

		return root;
	}

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return traversal(nums, 0, nums.length);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
