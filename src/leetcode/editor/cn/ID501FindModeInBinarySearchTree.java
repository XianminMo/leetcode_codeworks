package leetcode.editor.cn;

import com.sun.source.tree.Tree;
import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID501FindModeInBinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID501FindModeInBinarySearchTree().new Solution();
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
    private int count = 0;
	private int maxCount = 0;
	private List<Integer> res = new ArrayList();
	private TreeNode pre = null;

	public int[] findMode(TreeNode root) {
		if (root == null) {
			return new int[0];
		}

		searchBST(root);

		return res.stream().mapToInt(i -> i).toArray();
    }

	private void searchBST(TreeNode root) {
		if (root == null) return;
		searchBST(root.left);

		if (pre == null) {
			count = 1;
		} else if (root.val == pre.val) {
			count++;
		} else {
			count = 1;
		}
		pre = root;

		if (count == maxCount) {
			res.add(root.val);
		}

		if (count > maxCount) {
			maxCount = count;
			res.clear();
			res.add(root.val);
		}

		searchBST(root.right);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
