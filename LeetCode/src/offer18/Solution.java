package offer18;


class Solution {
    public ListNode deleteNode(ListNode head, int val) {
    	if(head.val==val) return head.next;
    	ListNode node = head;
    	ListNode prenode = head;
    	while(node.val!=val) {
    		if(node.next==null) {
    			return head;
    		}
    		prenode = node;
    		node = node.next;
    	}
    	prenode.next = node.next;
    	return head;
    }
}
