package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID108ConvertSortedArrayToBinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID108ConvertSortedArrayToBinarySearchTree().new Solution();
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
    public TreeNode sortedArrayToBST(int[] nums) {
		return traversal(nums, 0, nums.length);
    }

	private TreeNode traversal(int[] nums, int left, int right) {
		if (left >= right) return null;
		int mid = left + (right - left) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = traversal(nums, left, mid);
		node.right = traversal(nums, mid + 1, right);
		return node;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
