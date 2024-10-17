package leetcode.editor.cn;

import java.util.*;
public class ID216CombinationSumIii{
	public static void main(String[] args) {
		Solution solution = new ID216CombinationSumIii().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();
	int sum = 0;
	public List<List<Integer>> combinationSum3(int k, int n) {
		backTrack(1, k, n, sum);
		return result;
	}


	private void backTrack(int start, int k, int n, int sum) {
		if (path.size() == k) {
			if (sum == n){
				result.add(new ArrayList<>(path));
			}
			return;
		}

		for (int i = start; i <= 9; i++) {
			path.add(i);
			sum += i;
			backTrack(i+1, k, n, sum);
			sum -= i;
			path.removeLast();
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
