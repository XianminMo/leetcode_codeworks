package leetcode.editor.cn;

import java.util.*;
public class ID70ClimbingStairs{
	public static void main(String[] args) {
		Solution solution = new ID70ClimbingStairs().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
			return n;
		}

		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i < n + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
