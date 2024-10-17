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
			int[] temp = new int[len];
			mergeSort(nums, 0, len - 1, temp);
			return nums;
		}

		private void mergeSort(int[] nums, int left, int right, int[] temp) {
			if (right - left <= INSERTION_SORT_THRESHOLD) {
				insertSort(nums, left, right);
				return;
			}
			int mid = (right + left) >>> 1;
			mergeSort(nums, left, mid, temp);
			mergeSort(nums, mid + 1, right, temp);

			if (nums[mid] <= nums[mid + 1]) {
				return;
			}

			mergeTwoSortedArray(nums, left, right, mid, temp);
		}

		private void mergeTwoSortedArray(int[] nums, int left, int right, int mid, int[] temp) {
			System.arraycopy(nums, left, temp, left, right - left + 1);
			int i = left;
			int j = mid + 1;
			for (int k = left; k <= right; k++) {
				if (i == mid + 1) {
					nums[k] = temp[j];
					j++;
				} else if (j == right + 1) {
					nums[k] = temp[i];
					i++;
				} else if (temp[i] <= temp[j]) {
					nums[k] = temp[i];
					i++;
				} else { // temp[i] > temp[j]
					nums[k] = temp[j];
					j++;
				}
			}
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
