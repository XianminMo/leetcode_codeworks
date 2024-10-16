package leetcode.editor.cn;

import com.sun.source.tree.Tree;
import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID450DeleteNodeInABst{
	public static void main(String[] args) {
		Solution solution = new ID450DeleteNodeInABst().new Solution();
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
    public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) return null;

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode minNode = findMin(root.right);
                swap(root, minNode);
                root.right = deleteNode(root.right, key);
            }
        }
        return root;
    }

    private void swap(TreeNode root, TreeNode minNode) {
        int tmp = root.val;
        root.val = minNode.val;
        minNode.val = tmp;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
