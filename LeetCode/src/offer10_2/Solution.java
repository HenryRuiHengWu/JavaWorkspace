package offer10_2;

class Solution {
    public int numWays(int n) {
    	int a;
    	int b;
    	int res = 0;
    	
    	if(n == 0) {
    		return 1;
    	}else if(n==1) {
    		return 1;
    	}else {
    		a=1;
    		b=1;
    		for(int i=2;i<=n;i++) {
    			res=(a+b)%1000000007;
    			a=b;
    			b=res;
    		}
    		return res;
    	}
    }
}
