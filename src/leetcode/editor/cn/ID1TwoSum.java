package leetcode.editor.cn;

import java.util.*;
public class ID1TwoSum{
	public static void main(String[] args) {
		Solution solution = new ID1TwoSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (hashMap.containsKey(diff)) {
				return new int[] {hashMap.get(diff), i};
			}
			hashMap.put(nums[i], i);
		}

		return new int[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
