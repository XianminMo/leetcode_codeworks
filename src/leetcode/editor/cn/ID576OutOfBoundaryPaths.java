package leetcode.editor.cn;

import java.util.*;
public class ID576OutOfBoundaryPaths{
	public static void main(String[] args) {
		Solution solution = new ID576OutOfBoundaryPaths().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	private static final int MOD = 1000000007;

	public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
		int[][][] table = new int[m][n][maxMove + 1];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k <= maxMove; k++) {
					table[i][j][k] = -1;
				}
			}
		}

		return dfs(m, n, startRow, startColumn, maxMove, table);


	}

	private int dfs(int m, int n, int i, int j, int maxMoveCount, int[][][] table) {
		if (i < 0 || i >= m || j < 0 || j >= n) {
			return 1;
		}

		if (maxMoveCount == 0) {
			return 0;
		}

		if (table[i][j][maxMoveCount] != -1) {
			return table[i][j][maxMoveCount];
		}

		int ans = 0;
		for (int[] direction : DIRECTIONS) {
			int new_i = i + direction[0];
			int new_j = j + direction[1];

			ans = (ans + dfs(m, n, new_i, new_j, maxMoveCount - 1, table)) % MOD;
		}

		table[i][j][maxMoveCount] = ans;

		return ans;
	}
//leetcode submit region end(Prohibit modification and deletion)
}
}
