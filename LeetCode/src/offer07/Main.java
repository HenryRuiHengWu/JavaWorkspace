package offer07;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] preorder = { 3, 9, 20, 15, 7 };
		int[] inorder = { 9, 3, 15, 20, 7 };

		test(preorder, inorder);
	}

	private static void test(int[] preorder, int[] inorder) {
		Solution solution = new Solution();
		TreeNode output;
		long begin = System.currentTimeMillis();
		output = solution.buildTree(preorder, inorder);
		long end = System.currentTimeMillis();

/*
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}
*/
		System.out.println();
		//System.out.print(Arrays.toString(output));
		System.out.println();
		System.out.println("耗时：" + (end - begin) + "ms");
		System.out.println("-------------------");
	}

}
