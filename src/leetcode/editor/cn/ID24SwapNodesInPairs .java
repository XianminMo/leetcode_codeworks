package leetcode.editor.cn;

import leetcode.editor.util.ListNode;

import java.util.*;
public class ID24SwapNodesInPairs{
	public static void main(String[] args) {
		Solution solution = new ID24SwapNodesInPairs().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode sentinel = new ListNode();
		sentinel.next = head;

		ListNode cur = sentinel;

		while(cur.next != null && cur.next.next != null) {
			ListNode firstNode = cur.next;
			ListNode sencondNode = cur.next.next;
			// 交换节点
			firstNode.next = sencondNode.next;
			sencondNode.next = firstNode;
			cur.next = sencondNode;
			// 移动到下一对节点
			cur = cur.next.next;
		}

		return sentinel.next;
	}
}
//leetcode submit region end(Prohibit modification and deletion)