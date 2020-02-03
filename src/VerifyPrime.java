/**
 * Given a number N, verify if N is prime or not.
 *
 * Return 1 if N is prime, else return 0.
 *
 * @see <a href="https://www.interviewbit.com/problems/verify-prime/">Verify Prime</a>
 */
public class VerifyPrime {
	public static void main(String[] args) {
		System.out.println(isPrime(1231322131));
	}

	public static int isPrime(int A) {
		if (A == 1) {
			return 0;
		}

		for (int i = 2; i <= (int)Math.sqrt(A); i++) {
			if (A % i == 0) {
				return 0;
			}
		}

		return 1;
	}
}



