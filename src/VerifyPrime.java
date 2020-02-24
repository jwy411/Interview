/**
 * Given a number N, verify if N is prime or not.
 *
 * Return 1 if N is prime, else return 0.
 *
 * @see <a href="https://www.interviewbit.com/problems/verify-prime/">Verify Prime</a>
 */
public class VerifyPrime {
	public static void main(String[] args) {
		long startTimeMills = System.currentTimeMillis();
		int result = isPrime(2305843009213693951L);
		long endTimeMills = System.currentTimeMillis();

		System.out.println(result + "\t" + (endTimeMills - startTimeMills));
	}

	public static int isPrime(long A) {
		if (A == 1) {
			return 0;
		}

		for (long i = 2; i <= (long)Math.sqrt(A); i++) {
			if (A % i == 0) {
				return 0;
			}
		}

		return 1;
	}
}



