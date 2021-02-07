package offer05;


public class Main {
	public static void main(String[] args) {
		String s  = "We are happy.";
		test(s);
		
	}


	private static void test(String s) {
		Solution solution = new Solution();
		String output;
		long begin = System.currentTimeMillis();
		output = solution.replaceSpace(s);
		long end = System.currentTimeMillis();
		System.out.println(s); // 调用Arrays.toString()来打印整个数组
		System.out.println(output);
		System.out.println();
		System.out.println("耗时：" + (end - begin) + "ms");
		System.out.println("-------------------");
	}

}
