package offer06;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode firstNode = new ListNode(1);
		ListNode secondNode = new ListNode(2);
		ListNode thirdNode = new ListNode(3);
		head.next = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		test(head);
	}

	private static void test(ListNode head) {
		Solution solution = new Solution();
		int[] output;
		long begin = System.currentTimeMillis();
		output = solution.reversePrint(head);
		long end = System.currentTimeMillis();

		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}

		System.out.println();
		System.out.print(Arrays.toString(output));
		System.out.println();
		System.out.println("耗时：" + (end - begin) + "ms");
		System.out.println("-------------------");
	}

}
