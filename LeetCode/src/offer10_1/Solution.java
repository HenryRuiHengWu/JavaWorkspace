package offer10_1;


class Solution {
    public int fib(int n) {
    	
    	int a;
    	int b;
    	int res = 0;
    	
    	if(n == 0) {
    		return 0;
    	}else if(n==1) {
    		return 1;
    	}else {
    		a=0;
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




/*
class Solution {
    public int fib(int n) {
    	int res;
    	switch(n) {
    	case 0:
    		res = 0;
    		break;
		case 1:
			res = 1;
    		break;
		default:
			res = fib(n-1) + fib(n-2);
    		break;
    	}
    	return res%1000000007;
    }
}
*/