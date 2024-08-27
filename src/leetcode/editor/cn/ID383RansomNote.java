package leetcode.editor.cn;

import java.util.*;
public class ID383RansomNote{
	public static void main(String[] args) {
		Solution solution = new ID383RansomNote().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		int[] recordMagazine = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			recordMagazine[magazine.charAt(i) - 'a']++;
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			recordMagazine[ransomNote.charAt(i) - 'a']--;
		}

		for (int item : recordMagazine) {
			if (item < 0) {
				return false;
			}
		}

		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
