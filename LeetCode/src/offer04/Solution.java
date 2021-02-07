package offer04;

class Solution {

	// 从左下角开始，利用数组特点，类似于爬虫一路爬到右上角
	public boolean findNumberIn2DArray(int[][] matrix, int target) {
		int x = 0;
		int y = matrix.length - 1;
		while (y >= 0 && x <= matrix[0].length - 1) {
			if (matrix[y][x] > target)
				y--;
			else if (matrix[y][x] < target)
				x++;
			else
				return true;
		}
		return false;
	}
}