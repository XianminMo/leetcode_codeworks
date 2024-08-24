package leetcode.editor.cn;

import java.util.*;
public class ID15ThreeSum{
	public static void main(String[] args) {
		Solution solution = new ID15ThreeSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> returnList = new ArrayList<>();
		Arrays.sort(nums);

		for (int a = 0; a < nums.length; a++) {
			if (nums[a] > 0) {
				return returnList;
			}
			// a去重，如果当前a和上一个已经遍历过的a相同，则直接跳过
			if (a > 0 && nums[a] == nums[a - 1]) {
				continue;
			}

			int b = a + 1;
			int c = nums.length - 1;
			while (c > b) {
				int sum = nums[a] + nums[b] + nums[c];
				if (sum > 0) {
					c--;
				}
				else if (sum < 0) {
					b++;
				}
				else {
					returnList.add(Arrays.asList(nums[a], nums[b], nums[c]));
					// b, c去重：在已经找到一个三元组的情况下，若b, c与下一个即将要遍历的b, c相同，则直接移位跳过
					while (c > b && nums[c - 1] == nums[c]) {
						c--;
					}
					while (c > b && nums[b + 1] == nums[b]) {
						b++;
					}
					b++;
					c--;
				}
			}
		}

		return returnList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
