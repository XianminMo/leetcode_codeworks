package leetcode.editor.cn;

import leetcode.editor.util.ListNode;

import java.util.*;
public class ID142LinkedListCycleIi{
	public static void main(String[] args) {
		Solution solution = new ID142LinkedListCycleIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next; // 若有环，fast一定会在环里追上slow
			if (slow == fast) {
				ListNode index1 = fast; // 相遇节点
				ListNode index2 = head;
				while (index1 != index2) {
					index1 = index1.next;
					index2 = index2.next;
				}
				return index1;
			}
		}
		return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
