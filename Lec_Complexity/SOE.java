package Lec_Complexity;

import java.util.Arrays;

public class SOE {
	public static void main(String[] args) {
		solve(19999);
	}

	public static void solve(int n) {
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;

		for (int div = 2; div * div <= n; div++) {
//			div ka table laga hein!!
			if (isPrime[div] == true) { // nlog(log(n))
				for (int table = div * 2; table <= n; table = table + div) {
					isPrime[table] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.println(i);
			}
		}
	}
}
