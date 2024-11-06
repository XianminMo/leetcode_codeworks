package leetcode.editor.cn;

import java.util.*;
import java.util.function.BiConsumer;

public class ID62UniquePaths{
	public static void main(String[] args) {
		Solution solution = new ID62UniquePaths().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
			return 1;
		}

		int[][] dp = new int[m][n];
		dp[0][0] = 0;

		for (int i = 1; i < m; i++) {
			dp[i][0] = 1;
		}

		for (int j = 1; j < n; j++) {
			dp[0][j] = 1;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		return dp[m - 1][n - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
