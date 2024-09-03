package leetcode.editor.cn;

import leetcode.editor.util.Node;
import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID429NAryTreeLevelOrderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID429NAryTreeLevelOrderTraversal().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();
		Queue<Node> fringe = new LinkedList<>();
		fringe.add(root);

		while (!fringe.isEmpty()) {
			List<Integer> itemList = new ArrayList<>();
			int length = fringe.size();

			for (int i = 0; i < length; i++) {
				Node currentNode = fringe.poll();
				itemList.add(currentNode.val);
				for (Node child : currentNode.children) {
					fringe.add(child);
				}
			}
			result.add(itemList);
		}

		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
