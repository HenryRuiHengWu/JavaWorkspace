package offer14_1;

class Solution {
    public int cuttingRope(int n) {
    	int max = 0;
    	
    	for(int i=2;i<=n;i++) {
    		int ans = 1;
    		int count = n%i;
    		for(int j = 1;j<=i;j++) {
    			if(count>0) {
    				ans = ans*(n/i+1);
    				count--;
    			}else {
    				ans = ans*(n/i);
    			}
    		}
    		if(ans>max) {
    			max = ans;
    		}
    	}
    	return max;
    }
}
