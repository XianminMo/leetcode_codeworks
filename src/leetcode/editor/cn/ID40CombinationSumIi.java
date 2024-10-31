package leetcode.editor.cn;

import javax.swing.*;
import java.util.*;
public class ID40CombinationSumIi{
	public static void main(String[] args) {
		Solution solution = new ID40CombinationSumIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private List<List<Integer>> results = new ArrayList<>();
	private List<Integer> combination = new ArrayList<>();

	private void backTracking(int[] candidates, int target, int sum, int index) {
		if (sum == target) {
			results.add(new ArrayList<>(combination));
			return;
		}

		for (int i = index; i < candidates.length; i++) {
			if (sum + candidates[i]> target) {
				break;
			}

			if (i > index && candidates[i] == candidates[i - 1]) {
				continue;
			}

			sum += candidates[i];
			combination.add(candidates[i]);
			backTracking(candidates, target, sum, i + 1);
			sum -= candidates[i];
			combination.removeLast();
		}
	}
 		public List<List<Integer>> combinationSum2(int[] candidates, int target) {
			Arrays.sort(candidates);
			backTracking(candidates, target, 0, 0);
			return results;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
