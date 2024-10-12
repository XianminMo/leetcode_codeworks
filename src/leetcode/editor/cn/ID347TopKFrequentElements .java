package leetcode.editor.cn;

import java.util.*;
public class ID347TopKFrequentElements{
	public static void main(String[] args) {
		Solution solution = new ID347TopKFrequentElements().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> frequency = new HashMap<>();
		for (int num : nums) {
			frequency.put(num, frequency.getOrDefault(num, 0) + 1);
		}

		Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(pair -> pair[1]));
		for (Map.Entry<Integer, Integer> pair : frequency.entrySet()) {
			if (minHeap.size() < k) {
				minHeap.add(new int[]{pair.getKey(), pair.getValue()});
			} else if (pair.getValue() > minHeap.peek()[1]) {
				minHeap.poll();
				minHeap.add(new int[]{pair.getKey(), pair.getValue()});
			}
		}

		int[] res = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			res[i] = minHeap.poll()[0];
		}

		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
