package leetcode.editor.cn;

import java.util.*;
public class ID349IntersectionOfTwoArrays{
	public static void main(String[] args) {
		Solution solution = new ID349IntersectionOfTwoArrays().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> returnSet = new HashSet<>();
		for (int i : nums1) {
			set1.add(i);
		}

		for (int i : nums2) {
			if (set1.contains(i)) {
				returnSet.add(i);
			}
		}
		int[] result = new int[returnSet.size()];
		int j = 0;
		for (int item : returnSet) {
			result[j++] = item;
		}
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
