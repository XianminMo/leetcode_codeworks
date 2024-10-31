package leetcode.editor.cn;

import java.util.*;
public class ID46Permutations{
	public static void main(String[] args) {
		Solution solution = new ID46Permutations().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private List<List<Integer>> results = new ArrayList<>();
	private List<Integer> permutation = new ArrayList<>();
	private boolean[] visited;

	private void backTrack(int[] nums) {
		if (permutation.size() == nums.length) {
			results.add(new ArrayList<>(permutation));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (visited[i]) {
				continue;
			}
			permutation.add(nums[i]);
			visited[i] = true;
			backTrack(nums);
			visited[i] = false;
			permutation.removeLast();

		}
	}
		public List<List<Integer>> permute(int[] nums) {
        	visited = new boolean[nums.length];
			backTrack(nums);
			return results;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
