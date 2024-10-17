package leetcode.editor.cn;

import java.util.*;
public class ID77Combinations{
	public static void main(String[] args) {
		Solution solution = new ID77Combinations().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();
	public List<List<Integer>> combine(int n, int k) {
		backTrack(1, n, k);
		return result;
	}

	private void backTrack(int start, int n, int k) {
		if (path.size() == k) {
			result.add(new ArrayList<>(path));
			return;
		}

		for (int i = start; i <= n; i++) {
			path.add(i);
			backTrack(i+1, n, k);
			path.remove(path.size() - 1);
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
