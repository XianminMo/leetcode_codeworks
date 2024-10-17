package leetcode.editor.cn;

import leetcode.editor.util.Node;
import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID116PopulatingNextRightPointersInEachNode{
	public static void main(String[] args) {
		Solution solution = new ID116PopulatingNextRightPointersInEachNode().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
		if (root == null) {
			return null;
		}

		Queue<Node> fringe = new ArrayDeque<>();
		fringe.add(root);

		while (!fringe.isEmpty()) {
			int length = fringe.size();

			for (int i = 0; i < length; i++) {
				Node currentNode = fringe.poll();
				if (i < length - 1) {
					currentNode.next = fringe.peek();
				}
				if (currentNode.left != null) {
					fringe.add(currentNode.left);
				}
				if (currentNode.right != null) {
					fringe.add(currentNode.right);
				}
			}
		}

		return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
