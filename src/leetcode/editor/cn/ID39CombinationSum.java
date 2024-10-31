package leetcode.editor.cn;

import java.util.*;

public class ID39CombinationSum {
    public static void main(String[] args) {
        Solution solution = new ID39CombinationSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private List<List<Integer>> results = new ArrayList<>();
        private List<Integer> path = new ArrayList<>();

        private void backTracing(int[] candidates, int target, int sum, int index) {
			if (sum > target) {
				return;
			}

			if (sum == target) {
                results.add(new ArrayList<>(path));
                return;
            }

            for (int i = index; i < candidates.length; i++) {
                sum += candidates[i];
                path.add(candidates[i]);
                backTracing(candidates, target, sum, i);
                sum -= candidates[i];
                path.removeLast();
            }

        }

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            backTracing(candidates, target, 0, 0);
            return results;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
