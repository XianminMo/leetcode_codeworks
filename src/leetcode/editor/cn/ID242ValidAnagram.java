package leetcode.editor.cn;

import java.util.*;
public class ID242ValidAnagram{
	public static void main(String[] args) {
		Solution solution = new ID242ValidAnagram().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
		int[] record = new int[26];

		for (int i = 0; i < s.length(); i++) {
			record[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < t.length(); i++) {
			record[t.charAt(i) - 'a']--;
		}

		for (int count : record) {
			if (count != 0) {
				return false;
			}
		}

		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
