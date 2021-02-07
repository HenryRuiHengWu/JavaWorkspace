package offer13;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int movingCount(int m, int n, int k) {
		// java里默认元素都是0,创建这个地图
		boolean[][] square = new boolean[m][n];
		int[] root = { 0, 0 };

		Queue<int[]> rootqueue = new LinkedList<int[]>();
		rootqueue.add(root);

		int count = 0;

		while (!rootqueue.isEmpty()) {
			int[] node = rootqueue.poll();
			if (square[node[0]][node[1]] == true || (node[0] / 10 + node[0] % 10 + node[1] / 10 + node[1] % 10) > k) {
				continue;
			}
			square[root[0]][root[1]] = true;
			count++;
			if ((node[0] + 1) < m) {
				int[] node1 = { node[0] + 1, node[1] };
				rootqueue.add(node1);
			}
			if ((node[0] - 1) >= 0) {
				int[] node1 = { node[0] - 1, node[1] };
				rootqueue.add(node1);
			}
			if ((node[1] + 1) < n) {
				int[] node1 = { node[0], node[1] + 1 };
				rootqueue.add(node1);
			}
			if ((node[1] - 1) >= 0) {
				int[] node1 = { node[0], node[1] - 1 };
				rootqueue.add(node1);
			}
		}

		return count;
	}
}