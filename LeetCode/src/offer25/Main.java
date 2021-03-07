package offer25;

public class Main {
	public static void main(String[] args) {
		ListNode head1 = new ListNode(2);
		ListNode firstNode1 = new ListNode(4);
		ListNode secondNode1 = new ListNode(6);
		ListNode thirdNode1 = new ListNode(8);
		ListNode forthNode1 = new ListNode(10);
		ListNode fifthNode1 = new ListNode(12);
		head1.next = firstNode1;
		firstNode1.next = secondNode1;
		secondNode1.next = thirdNode1;
		thirdNode1.next = forthNode1;
		forthNode1.next = fifthNode1;

		ListNode head2 = new ListNode(1);
		ListNode firstNode2 = new ListNode(3);
		ListNode secondNode2 = new ListNode(5);
		ListNode thirdNode2 = new ListNode(7);
		ListNode forthNode2 = new ListNode(9);
		ListNode fifthNode2 = new ListNode(11);
		head2.next = firstNode2;
		firstNode2.next = secondNode2;
		secondNode2.next = thirdNode2;
		thirdNode2.next = forthNode2;
		forthNode2.next = fifthNode2;

		Solution solution = new Solution();

		ListNode temp = head1;

		System.out.println("List1:");
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}

		temp = head2;
		System.out.println();
		System.out.println("List2:");
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}

		System.out.println();

		temp = solution.mergeTwoLists(head1, head2);
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}
	}
}
