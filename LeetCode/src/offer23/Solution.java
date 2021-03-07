package offer23;

class Solution {
	public ListNode reverseList(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode nextnode, temp = null;
		while (head.next != null) {
			nextnode = head.next;
			head.next = temp;
			temp = head;
			head = nextnode;
		}
		head.next = temp;
		return head;
	}
}
