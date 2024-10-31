package leetcode.editor.cn;

import java.util.*;
public class ID78Subsets{
	public static void main(String[] args) {
		Solution solution = new ID78Subsets().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private List<List<Integer>> results = new ArrayList<>();
	private List<Integer> subSet = new ArrayList<>();

	private void backTrack(int[] nums, int start) {
		if (start == nums.length) {
			return;
		}

		for (int i = start; i < nums.length; i++) {
			subSet.add(nums[i]);
			results.add(new ArrayList<>(subSet));
			backTrack(nums, i + 1);
			subSet.removeLast();
		}
	}
		public List<List<Integer>> subsets(int[] nums) {
        	backTrack(nums, 0);
			results.add(new ArrayList<>());
			return results;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
