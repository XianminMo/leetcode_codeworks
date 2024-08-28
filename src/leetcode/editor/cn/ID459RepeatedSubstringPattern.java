package leetcode.editor.cn;

import java.util.*;
public class ID459RepeatedSubstringPattern{
	public static void main(String[] args) {
		Solution solution = new ID459RepeatedSubstringPattern().new Solution();
		StringBuilder sb = new StringBuilder();

		//执行测试
		boolean flag = solution.repeatedSubstringPattern("abac");

		System.out.println(sb);
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		int[] prefixTable = buildPrefixTable(s);
		if (prefixTable[len - 1] == 0) {
			return false;
		}
		int minL = s.length() - prefixTable[len - 1];
        return len % minL == 0;
    }

	private int[] buildPrefixTable(String s) {
		int n = s.length();
		int[] prefixTable = new int[n];
		int len = 0;
		prefixTable[0] = len;
		for (int i = 1; i < n; i++) {
			while (len > 0 && s.charAt(len) != s.charAt(i)) {
				len = prefixTable[len - 1];
			}
			if (len == 0) {
				prefixTable[i] = 0;
			}
			if (s.charAt(len) == s.charAt(i)) {
				len++;
				prefixTable[i] = len;
			}
		}
		return prefixTable;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
