package leetcode.editor.cn;

import leetcode.editor.util.ListNode;

import java.util.*;
public class ID19RemoveNthNodeFromEndOfList{
	public static void main(String[] args) {
		Solution solution = new ID19RemoveNthNodeFromEndOfList().new Solution();
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode sentinel = new ListNode();
		sentinel.next = head;

		ListNode fast = sentinel;
		ListNode slow = sentinel;

		// 先让fast走n+1步，这样slow, fast再同时走，当fast指向null，slow可以指向被删节点的上一个节点
		for (int i = 0; i < n + 1; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		ListNode delNode = slow.next;
		slow.next = delNode.next;

		return sentinel.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
