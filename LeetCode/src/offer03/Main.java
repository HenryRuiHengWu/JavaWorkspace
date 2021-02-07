package offer03;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] testTable = {0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		test(testTable);
		
		
	}
	
	private static void test(int[] input) {
		Solution solution = new Solution();
		int output;
		long begin = System.currentTimeMillis();
		output = solution.findRepeatNumber(input);
		long end = System.currentTimeMillis();
		System.out.print(Arrays.toString(input));  //调用Arrays.toString()来打印整个数组
		System.out.println(":	output=" + output);
		System.out.println();
		System.out.println("耗时：" + (end - begin) + "ms");
		System.out.println("-------------------");
	}
}
