package offer18;



public class Main {
	public static void main(String[] args) {
		ListNode head = new ListNode(-3);
		ListNode firstNode = new ListNode(5);
		ListNode secondNode = new ListNode(-99);
		head.next = firstNode;
		firstNode.next = secondNode;
		
		Solution solution = new Solution();
		ListNode temp = solution.deleteNode(head, -99);
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}
	}
}
