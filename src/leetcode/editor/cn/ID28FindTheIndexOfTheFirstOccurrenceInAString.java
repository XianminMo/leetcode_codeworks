package leetcode.editor.cn;

import java.util.*;
public class ID28FindTheIndexOfTheFirstOccurrenceInAString{
	public static void main(String[] args) {
		Solution solution = new ID28FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
		StringBuilder sb = new StringBuilder();
		int k = solution.strStr("daadaadtdad", "ababa");
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		}
		int[] prefixTable = buildPrefixTable(needle); // 前缀表记录模式字符串中每个索引上可以回溯到的位置，换句话说就是最大公共前后缀长度
		int m = haystack.length();
		int n = needle.length();
		int i; // 文本字符串索引
		int j = 0; // 模式字符串索引，也代表了匹配上的长度，注意可以回溯，不要重复匹配
		List<Integer> index = new ArrayList<>();
		for (i = 0; i < m; i++) { // 先回溯再对比！
			while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
				j = prefixTable[j - 1]; // 找到之前匹配过的可以回去的位置
			}

			if (haystack.charAt(i) == needle.charAt(j)) {
				j++;
				if (j == n) {
					index.add(i + 1 - j); // j已经增1，所以计算index需要i也增1
					j = prefixTable[j - 1];
				}
			}
		}
		if (index.isEmpty()) {
			return -1;
		}
		return index.getFirst();
    }

	private int[] buildPrefixTable(String needle) {
		int n = needle.length();
		int[] prefixTable = new int[n];
		int len = 0; // 已记录最大公共前后缀长度，同时也是前缀末尾
		prefixTable[0] = len;
		for (int i = 1; i < n; i++) { // 索引i
			// 先回溯再对比！否则会覆盖prefixTable原本已经有的值
			while (len > 0 && needle.charAt(len) != needle.charAt(i)) {
				len = prefixTable[len - 1];
			}
			if (len == 0) {
				prefixTable[i] = 0;
			}
			if (needle.charAt(len) == needle.charAt(i)) {
				len++;
				prefixTable[i] = len;
			}
		}
		return prefixTable;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
