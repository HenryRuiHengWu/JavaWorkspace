package offer23;

public class Main {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode firstNode = new ListNode(2);
		ListNode secondNode = new ListNode(3);
		ListNode thirdNode = new ListNode(4);
		ListNode forthNode = new ListNode(5);
		ListNode fifthNode = new ListNode(6);
		head.next = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = forthNode;
		forthNode.next = fifthNode;

		Solution solution = new Solution();
		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}
		
		System.out.println();
		
		temp = solution.reverseList(null);
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}
	}
}
