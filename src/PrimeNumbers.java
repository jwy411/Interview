import java.util.ArrayList;

public class PrimeNumbers {
	public static void main(String[] args) {
		long startTimeMills = System.currentTimeMillis();
		ArrayList<Integer> results = sieve(1000000000);
		long endTimeMills = System.currentTimeMillis();

		System.out.println((endTimeMills - startTimeMills));
	}

	public static ArrayList<Integer> sieve(int A) {
		boolean[] primes = new boolean[A + 1];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}

		primes[0] = false;
		primes[1] = false;

		for (int i = 2; i <= Math.sqrt(A); i++) {
			if (primes[i]) {
				for (int j = 2; j * i <= A; j++) {
					primes[j * i] = false;
				}
			}
		}

		ArrayList<Integer> results = new ArrayList<>();
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				results.add(i);
			}
		}

		return results;
	}
}
