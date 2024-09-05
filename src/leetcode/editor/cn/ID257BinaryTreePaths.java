package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID257BinaryTreePaths{
	public static void main(String[] args) {
		Solution solution = new ID257BinaryTreePaths().new Solution();
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
    public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		List<Integer> paths = new ArrayList<>();
		traversal(root, result, paths);

		return result;
    }

	private void traversal(TreeNode root, List<String> result, List<Integer> paths) {
		paths.add(root.val);
		// 递归终止条件：该节点为叶节点
		if (root.left == null && root.right == null) {
			StringBuilder sb = new StringBuilder(); // 生成一个路径字符串
			int size = paths.size();
			for (int i = 0; i < size - 1; i++) { // 最后一个节点先不添加，因为要处理"->"
				sb.append(paths.get(i)).append("->");
			}
			sb.append(paths.get(size - 1));

			result.add(sb.toString());
			return;
		}

		if (root.left != null) {
			traversal(root.left, result, paths);
			paths.removeLast(); // 回溯，把已经有路径的节点弹出
		}
		if (root.right != null) {
			traversal(root.right, result, paths);
			paths.removeLast(); // 回溯，把已经有路径的节点弹出
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
