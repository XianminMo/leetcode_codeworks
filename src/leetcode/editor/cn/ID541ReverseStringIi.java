package leetcode.editor.cn;

import java.util.*;
public class ID541ReverseStringIi{
	public static void main(String[] args) {
		Solution solution = new ID541ReverseStringIi().new Solution();
		StringBuilder sb = new StringBuilder();
		String s = "abcdefg";
		int k = 2;
		String result = solution.reverseStr(s, k);
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseStr(String s, int k) {
		char[] charS = s.toCharArray();
		for (int i = 0; i < charS.length; i += 2 * k) {
			if (i + k <= charS.length - 1) {
				reverse(charS, i, i + k - 1);
			}
			else {
				reverse(charS, i, charS.length - 1);
			}
		}
		return new String(charS);
    }

	private void reverse(char[] charS, int start, int end) {
		while (start < end) {
			char temp = charS[start];
			charS[start] = charS[end];
			charS[end] = temp;
			start++;
			end--;
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
