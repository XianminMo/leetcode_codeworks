package leetcode.editor.cn;

import java.util.*;
public class ID131PalindromePartitioning{
	public static void main(String[] args) {
		Solution solution = new ID131PalindromePartitioning().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private List<List<String>> results = new ArrayList<>();
	private List<String> currentPartition = new ArrayList<>();

	private void backTrack(String s, int start) {
		if (start == s.length()) {
			results.add(new ArrayList<>(currentPartition));
			return;
		}

		for (int end = start; end < s.length(); end++) {
			if (isPalindrome(s, start, end)) {
				currentPartition.add(s.substring(start, end + 1));
				backTrack(s, end + 1);
				currentPartition.removeLast();
			}

		}
	}

	private boolean isPalindrome(String s, int start, int end) {
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public List<List<String>> partition(String s) {
		backTrack(s, 0);
		return results;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
