package offer25;

class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode re = new ListNode(0);
		ListNode po = new ListNode(0);
		
		re.next = po;
		while (l1 != null || l2 != null) {
			
			ListNode nextNode = new ListNode(0);
			
			
			if (l1 == null || l2 == null) {
				if (l1 == null) {
					nextNode.val = l2.val;
					l2 = l2.next;
				} else {
					nextNode.val = l1.val;
					l1 = l1.next;
				}

			} else {
				if (l1.val > l2.val) {
					nextNode.val = l2.val;
					l2 = l2.next;
				} else {
					nextNode.val = l1.val;
					l1 = l1.next;
				}

			}
			po.next = nextNode;
			po = nextNode;
			
		}
		return re.next.next;

	}
}
