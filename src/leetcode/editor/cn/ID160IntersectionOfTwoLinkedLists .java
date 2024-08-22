package leetcode.editor.cn;

import leetcode.editor.util.ListNode;

import java.util.*;
public class ID160IntersectionOfTwoLinkedLists{
	public static void main(String[] args) {
		Solution solution = new ID160IntersectionOfTwoLinkedLists().new Solution();
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
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
		ListNode p2 = headB;

		// 2+3+3 = 3+3+2 真的是精妙绝伦！
		while (p1 != p2) {
			if (p1 == null) {
				p1 = headB;
			}
			else {
				p1 = p1.next;
			}

			if (p2 == null) {
				p2 = headA;
			}
			else {
				p2 = p2.next;
			}
		}
		return p1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
