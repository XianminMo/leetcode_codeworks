package leetcode.editor.cn;

import com.sun.source.tree.Tree;
import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID199BinaryTreeRightSideView{
	public static void main(String[] args) {
		Solution solution = new ID199BinaryTreeRightSideView().new Solution();
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
    public List<Integer> rightSideView(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<Integer> result = new ArrayList<>();
		Queue<TreeNode> fringe = new LinkedList<>();
		fringe.add(root);

		while (!fringe.isEmpty()) {
			List<Integer> itemList = new ArrayList<>();
			int len = fringe.size();
			while (len > 0) {
				TreeNode currentNode = fringe.poll();

				if (currentNode.left != null) { // 左孩子先入队
					fringe.add(currentNode.left);
				}

				if (currentNode.right != null) {
					fringe.add(currentNode.right);
				}

				if (len == 1) {
					result.add(currentNode.val); // 队列中这一层只剩最后一个便是最右边的
				}

				len--;
			}
		}

		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
