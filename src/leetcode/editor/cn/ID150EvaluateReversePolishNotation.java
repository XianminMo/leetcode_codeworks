package leetcode.editor.cn;

import java.util.*;
public class ID150EvaluateReversePolishNotation{
	public static void main(String[] args) {
		Solution solution = new ID150EvaluateReversePolishNotation().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
		Deque<Integer> stack = new LinkedList<>();
		for (String s : tokens) {
			if (s.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if (s.equals("*")) {
				stack.push(stack.pop() * stack.pop());
			} else if (s.equals("-")) {
				stack.push(-stack.pop() + stack.pop());
			} else if (s.equals("/")) {
				int temp1 = stack.pop();
				int temp2 = stack.pop();
				stack.push(temp2 / temp1);
			} else {
				stack.push(Integer.valueOf(s));
			}
		}
		return stack.pop();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
