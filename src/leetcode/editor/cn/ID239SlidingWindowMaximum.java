package leetcode.editor.cn;

import javax.swing.plaf.PanelUI;
import java.util.*;
public class ID239SlidingWindowMaximum{
	public static void main(String[] args) {
		Solution solution = new ID239SlidingWindowMaximum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
	class MyQueue {
		private Deque<Integer> deque;

		public MyQueue() {
			deque = new LinkedList<>();
		}

		public void poll(int val) {
			if (!deque.isEmpty() && val == deque.peek()) {
				deque.poll();
			}
		}

		public void add(int val) {
			while (!deque.isEmpty() && val > deque.getLast()) {
				deque.removeLast();
			}
			deque.addLast(val);
		}

		public int peek() {
			return deque.peek();
		}

	}
	class Solution {
		public int[] maxSlidingWindow(int[] nums, int k) {
			if (nums.length == 1) {
				return nums;
			}

			int len = nums.length - k + 1;
			int[] result = new int[len];
			int index = 0;
			MyQueue deque = new MyQueue();

			for (int i = 0; i < k; i++) {
				deque.add(nums[i]);
			}

			result[index++] = deque.peek();

			for (int i = k; i < nums.length; i++) {
				deque.poll(nums[i - k]);
				deque.add(nums[i]);
				result[index++] = deque.peek();
			}

			return result;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
