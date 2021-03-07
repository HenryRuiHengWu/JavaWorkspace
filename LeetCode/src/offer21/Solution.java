package offer21;

class Solution {
	public int[] exchange(int[] nums) {
		int i = 0, j = nums.length - 1;
		while (i < j) {
			if (nums[i] % 2 == 1) {
				i++;
				continue;
			} else {
				if(nums[j]%2==1) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					i++;
					j--;
					continue;
				}else {
					j--;
					continue;
				}
			}
		}
		return nums;
	}
}
