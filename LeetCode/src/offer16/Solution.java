package offer16;

class Solution {
    public double myPow(double x, int n) {
    	if(n==0) return 1;
    	double res = 1;
    	if(n>0) {
    		for(int i = 1;i<=n;i++) {
    			res = res*x;
    		}
    	}else {
    		for(int i = -1;i>=n;i--) {
    			res = res/x;
    		}
    	}
    	return res;
    }
}
