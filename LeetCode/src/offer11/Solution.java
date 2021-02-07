package offer11;

class Solution {
    public int minArray(int[] numbers) {
    	for(int i=numbers.length-1;i>0;i--) {
    		if(numbers[i]<numbers[i-1]) {
    			return numbers[i];
    		}
    	}
    	return numbers[0];
    }
}