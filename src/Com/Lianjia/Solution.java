package Com.Lianjia;

public class Solution {
	
	public static void main(String[] args) {
		
	}
	
	public int coinChange(int[] coins, int amount) {
		if (amount < 1)
			return 0;
		return helper(coins, amount, new int[amount]);
	}

	private int helper(int[] coins, int rem, int[] count) {
		if (rem < 0)
			return -1; // not valid
		if (rem == 0)
			return 0; // completed
		if (count[rem - 1] != 0)
			return count[rem - 1]; // already computed, so reuse
		int min = Integer.MAX_VALUE;
		for (int coin : coins) {
			int res = helper(coins, rem - coin, count);
			if (res >= 0 && res < min)
				min = 1 + res;
		}
		count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
		return count[rem - 1];
	}
}