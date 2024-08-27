package leetcode.editor.cn;

import java.util.*;
public class ID151ReverseWordsInAString{
	public static void main(String[] args) {
		Solution solution = new ID151ReverseWordsInAString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		String s = " the sky is blue ";
		String result = solution.reverseWords(s);
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
		char[] charS = s.toCharArray();
		charS = removeExtraSpaces(charS);
		charS = reverse(charS, 0, charS.length - 1);
		charS = reverseEachWords(charS);
		return new String(charS);
    }

	private char[] reverseEachWords(char[] charS) {
		int start = 0;
		for (int i = 0; i < charS.length; i++) {
			if (charS[i] == ' ') {
				reverse(charS, start, i - 1);
				start = i + 1;
			}
		}
		return charS;
	}

	private char[] removeExtraSpaces(char[] charS) {
		int slow = 0;
		int fast;
		for (fast = 0; fast < charS.length; fast++) {
			if (charS[fast] != ' ') {
				// 如果不是第一个单词，在单词开始存放前加一个空格
				if (slow != 0) {
					charS[slow++] = ' ';
				}
				charS[slow++] = charS[fast];
			}
		}

		return charS;
	}

	private char[] reverse(char[] charS, int start, int end) {
		while (start <= end) {
			char temp = charS[start];
			charS[start] = charS[end];
			charS[end] = temp;
			start++;
			end--;
		}
		return charS;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
