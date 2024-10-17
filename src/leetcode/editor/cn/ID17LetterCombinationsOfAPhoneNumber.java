package leetcode.editor.cn;

import jdk.jshell.Snippet;

import javax.swing.*;
import java.util.*;
public class ID17LetterCombinationsOfAPhoneNumber{
	public static void main(String[] args) {
		Solution solution = new ID17LetterCombinationsOfAPhoneNumber().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		solution.letterCombinations("23");
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<String> result = new ArrayList<>();
	StringBuilder sb = new StringBuilder();
	String[] num2String = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.isEmpty()) {
			return result;
		}
		backTrace(digits, 0);
		return result;
	}

	private void backTrace(String digits, int index) {
		if (index == digits.length()) {
			result.add(sb.toString());
			return;
		}

		String str = num2String[digits.charAt(index) - '0'];
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			backTrace(digits, index + 1);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
