package offer12;

import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

class Solution {
	public boolean exist(char[][] board, String word) {

		// 把目标字符串拆分成字符数组
		char[] target = word.toCharArray();

		// 新建一个队列来记录头一个字母的位置
		Queue<int[]> rootqueue = new LinkedList<int[]>();
		// 找到头一个字母的位置，放进队列中
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == target[0]) {
					int[] root = { i, j };
					rootqueue.offer(root);
				}
			}
		}

		// 队列为空，证明第一个字母都没有找到，直接返回false
		if (rootqueue.isEmpty()) {
			return false;
		} else {

			// 把队列的元素一个个取出来
			while (!rootqueue.isEmpty()) {

				// 以每一个节点开始深度优先搜索
				int[] root = rootqueue.poll();

				// 用一个集合把用过的点存入set里面，用过的点标注一下

				Set<String> road = new HashSet<String>();

				String r_str = "%d,%d";
				
				road.add(r_str.formatted(root[0],root[1]));

				if (dfs(board, target, root, 1, road)) {
					return true;
				}

			}
		}
		return false;
	}

	public boolean dfs(char[][] board, char[] target, int[] root, int position, Set<String> road) {

		if (position == target.length) {
			return true;
		}

		int x_len = board.length;
		int y_len = board[0].length;

		boolean res1 = false;
		boolean res2 = false;
		boolean res3 = false;
		boolean res4 = false;
		boolean res = false;

		if (root[0] != x_len - 1) {

			if (board[root[0] + 1][root[1]] == target[position]) {
				int[] rootnext = { root[0] + 1, root[1] };
				String r_str = "%d,%d";
				if (road.add(r_str.formatted(rootnext[0],rootnext[1]))) {
					res1 = dfs(board, target, rootnext, position + 1, road);
					if (res1 == false)
						road.remove(r_str.formatted(rootnext[0],rootnext[1]));
				}
			}
		}
		if (root[0] != 0) {
			if (board[root[0] - 1][root[1]] == target[position]) {
				int[] rootnext = { root[0] - 1, root[1] };
				String r_str = "%d,%d";
				if (road.add(r_str.formatted(rootnext[0],rootnext[1]))) {
					res2 = dfs(board, target, rootnext, position + 1, road);
					if (res2 == false)
						road.remove(r_str.formatted(rootnext[0],rootnext[1]));
				}
			}
		}

		if (root[1] != y_len - 1) {

			if (board[root[0]][root[1] + 1] == target[position]) {
				int[] rootnext = { root[0], root[1] + 1 };
				String r_str = "%d,%d";
				if (road.add(r_str.formatted(rootnext[0],rootnext[1]))) {
					res3 = dfs(board, target, rootnext, position + 1, road);
					if (res3 == false)
						road.remove(r_str.formatted(rootnext[0],rootnext[1]));
				}
			}
		}
		if (root[1] != 0) {
			if (board[root[0]][root[1] - 1] == target[position]) {
				int[] rootnext = { root[0], root[1] - 1 };
				String r_str = "%d,%d";
				if (road.add(r_str.formatted(rootnext[0],rootnext[1]))) {
					res4 = dfs(board, target, rootnext, position + 1, road);
					if (res4 == false)
						road.remove(r_str.formatted(rootnext[0],rootnext[1]));

				}
			}
		}

		res = res1 || res2 || res3 || res4;

		return res;

	}
}
