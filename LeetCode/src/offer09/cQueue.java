package offer09;

import java.util.Stack;



class CQueue {

	Stack<Integer> sk1 = new Stack<Integer>();
	Stack<Integer> sk2 = new Stack<Integer>();
	
	public CQueue() {
		
	}

	public void appendTail(int value) {
		sk1.push(value);
	}

	public int deleteHead() {
		if(sk2.isEmpty()) {
			if(sk1.isEmpty()) {
				return -1;
			}
			else {
				while(!sk1.isEmpty()) {
					sk2.push(sk1.pop());
				}
				return sk2.pop();
			}
			
		}
		else {
			return sk2.pop();
		}
		
	}
}

/**
 * Your CQueue object will be instantiated and called as such: CQueue obj = new
 * CQueue(); obj.appendTail(value); int param_2 = obj.deleteHead();
 */
