package leetcode.editor.cn;

import java.util.*;
public class ID912SortAnArray {
	public static void main(String[] args) {
		Solution solution = new ID912SortAnArray().new Solution();
		StringBuilder sb = new StringBuilder();

		//执行测试

		System.out.println(sb);
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		private static final int INSERTION_SORT_THRESHOLD = 7;
		public int[] sortArray(int[] nums) {
			int len = nums.length;
			quikSort(nums, 0, len - 1);
			return nums;
		}

		private void quikSort(int[] nums, int left, int right) {
			if (right - left <= INSERTION_SORT_THRESHOLD) {
				insertSort(nums, left, right);
				return;
			}

			int randomIndex = new Random().nextInt(right - left + 1) + left;
			swap(nums, left, randomIndex);

			int pivot = nums[left];
			int lt = left;
			int gt = right + 1;
			int i = left + 1;

			while (i < gt) {
				if (nums[i] < pivot) {
					lt++;
					swap(nums, i, lt);
					i++;
				} else if (nums[i] == pivot) {
					i++;
				} else {
					gt--;
					swap(nums, i, gt);
				}
			}
			swap(nums, left, lt);

			quikSort(nums, left, lt);
			quikSort(nums, gt, right);
		}


		private void swap(int[] nums, int i, int j) {
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}

		private void insertSort(int[] nums, int left, int right) {
			for (int i = left + 1; i <= right; i++) {
				int temp = nums[i];
				int j = i;
				while (j > left && nums[j - 1] > temp) {
					nums[j] = nums[j - 1];
					j--;
				}
				nums[j] = temp;
			}
		}
//leetcode submit region end(Prohibit modification and deletion)

	}
}
