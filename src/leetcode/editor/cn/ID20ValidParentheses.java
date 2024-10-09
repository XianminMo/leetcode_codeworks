package leetcode.editor.cn;

import java.util.*;
public class ID20ValidParentheses{
	public static void main(String[] args) {
		Solution solution = new ID20ValidParentheses().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
		Deque<Character> stack = new LinkedList<>();
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch == '(') {
				stack.push(')');
			}
			else if (ch == '[') {
				stack.push(']');
			}
			else if (ch == '{') {
				stack.push('}');
			}
			else if (stack.isEmpty() || stack.peek() != ch) {
				return false;
			}
			else {
				stack.pop();
			}
		}

		return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
