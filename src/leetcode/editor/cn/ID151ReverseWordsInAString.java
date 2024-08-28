package leetcode.editor.cn;

import java.util.*;
public class ID151ReverseWordsInAString{
	public static void main(String[] args) {
		Solution solution = new ID151ReverseWordsInAString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		String s = " the sky is blue";
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
			// 若碰到一个空格，则反转空格之前的单词
			if (charS[i] == ' ') {
				reverse(charS, start, i - 1);
				start = i + 1;
			}
			// 若到结尾了，则反转最后一个单词
			if (i == charS.length -1) {
				reverse(charS, start, i);
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
				// 将这个单词添加进去
				while (charS[fast] != ' ') {
					charS[slow++] = charS[fast++];
					// 若fast++后指到数组外面，则跳出循环
					if (fast == charS.length) {
						break;
					}
				}
			}
		}
		// 将去掉空格后的数组取出
		char[] result = new char[slow];
		System.arraycopy(charS, 0, result, 0, slow);

		return result;
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
