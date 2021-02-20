package offer16;

class Solution {
	public double myPow(double x, int n) {
		if (x == 0)
			return 0;
		double res = 1;
		if (n > 0) {
			while (n != 0) {
				if (n % 2 == 1) {
					res *= x;
				}
				x *= x;
				n = n / 2;
			}
		} else {

			while (n != 0) {
				if (n % 2 == -1) {
					res *= x;
				}
				x *= x;
				n = n / 2;
			}
			res = 1 / res;
		}
		return res;
	}
}
