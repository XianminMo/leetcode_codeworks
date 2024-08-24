package leetcode.editor.cn;

import java.util.*;
public class ID454FourSumIi{
	public static void main(String[] args) {
		Solution solution = new ID454FourSumIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		HashMap<Integer, Integer> recordSum = new HashMap<>();

		// 记录 nums1 和 nums2 中所有可能的和的出现次数
		for (int item1 : nums1) {
			for (int item2 : nums2) {
				int sum = item1 + item2;
				recordSum.put(sum, recordSum.getOrDefault(sum, 0) + 1);
			}
		}

		int count = 0;
		// 查找 nums3 和 nums4 中所有可能的和的相反数
		for (int item3 : nums3) {
			for (int item4 : nums4) {
				int target = -(item3 + item4);
				if (recordSum.containsKey(target)) {
					count += recordSum.get(target);
				}
			}
		}

		return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
