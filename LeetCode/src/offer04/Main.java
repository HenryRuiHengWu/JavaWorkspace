package offer04;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int[][] testTable = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };

		// int[][] testTable = {{-5}};
		System.out.println(testTable[0].length);
		int target = 5;
		test(testTable, target);
	}

	private static void test(int[][] input, int target) {
		Solution solution = new Solution();
		boolean output;
		long begin = System.currentTimeMillis();
		output = solution.findNumberIn2DArray(input, target);
		long end = System.currentTimeMillis();
		System.out.println(Arrays.deepToString(input)); // 调用Arrays.toString()来打印整个数组
		System.out.println("target=" + target);
		System.out.println(output);
		System.out.println();
		System.out.println("耗时：" + (end - begin) + "ms");
		System.out.println("-------------------");
	}
}
