package leetcode.editor.cn;

import java.util.*;
public class ID509FibonacciNumber{
	public static void main(String[] args) {
		Solution solution = new ID509FibonacciNumber().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int fib(int n) {
        if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i < n + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
