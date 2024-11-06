package leetcode.editor.cn;

import java.util.*;
public class ID1137NThTribonacciNumber{
	public static void main(String[] args) {
		Solution solution = new ID1137NThTribonacciNumber().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int tribonacci(int n) {
        int[] table = new int[n + 1];
		return my_tribonacci(n, table);
    }

	private int my_tribonacci(int n, int[] table) {
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		}

		if (table[n] != 0) {
			return table[n];
		}

		table[n] = my_tribonacci(n - 1, table) + my_tribonacci(n - 2, table) + my_tribonacci(n - 3, table);

		return table[n];
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
