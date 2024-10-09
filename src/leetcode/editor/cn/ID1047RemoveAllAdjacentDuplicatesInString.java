package leetcode.editor.cn;

import java.util.*;
public class ID1047RemoveAllAdjacentDuplicatesInString{
	public static void main(String[] args) {
		Solution solution = new ID1047RemoveAllAdjacentDuplicatesInString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
		StringBuilder result = new StringBuilder();
		int index = -1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (index >= 0 && result.charAt(index) == ch) {
				result.deleteCharAt(index);
				index--;
			} else {
				result.append(ch);
				index++;
			}
		}
		return result.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
