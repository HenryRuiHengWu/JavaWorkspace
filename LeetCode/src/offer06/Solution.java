package offer06;

import java.util.Stack;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */

class Solution {
	public int[] reversePrint(ListNode head) {
		Stack<Integer> sk = new Stack<Integer>();

		while (head != null) {
			sk.push(head.val);
			head = head.next;
		}

		int[] output = new int[sk.size()];

		for (int i = 0; i < output.length; i++) {
			output[i] = sk.pop();
		}
		return output;
	}
}