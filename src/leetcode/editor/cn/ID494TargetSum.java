package leetcode.editor.cn;

import java.util.*;
public class ID494TargetSum{
	public static void main(String[] args) {
		Solution solution = new ID494TargetSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	private Map<String, Integer> table = new HashMap<>();

	public int findTargetSumWays(int[] nums, int target) {
		return dfs(nums, 0, 0, target);
	}

	private int dfs(int[] nums, int index, int sum, int target) {
		if (index == nums.length) {
			return sum == target ? 1 : 0;
		}

		// 使用字符串作为键，避免嵌套 Map
		String key = index + "," + sum;

		// 检查缓存，避免重复计算
		if (table.containsKey(key)) {
			return table.get(key);
		}

		// 递归计算结果
		int result = dfs(nums, index + 1, sum + nums[index], target) + dfs(nums, index + 1, sum - nums[index], target);

		// 缓存计算结果
		table.put(key, result);

		return result;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
