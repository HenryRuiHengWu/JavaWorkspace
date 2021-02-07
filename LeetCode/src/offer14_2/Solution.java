package offer14_2;

class Solution {
	public int cuttingRope(int n) {
		if (n <= 3)
			return n - 1;
		int a = n / 3, b = n % 3, p = 1000000007;
		long rem = 1;
		if (b == 0) {
			for (int i = 1; i <= a; i++) {
				rem = (rem * 3) % p;
			}
			return (int) rem;
		}

		if (b == 1) {
			for (int i = 1; i <= a - 1; i++) {
				rem = (rem * 3) % p;
			}
			return (int) ((rem * 4) % p);

		}
		for (int i = 1; i <= a; i++) {
			rem = (rem * 3) % p;
		}
		return (int) ((rem * 2) % p);
	}
}
