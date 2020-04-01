public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println(gcd(18, 36));
		System.out.println(gcdBest(18, 36));
	}

	public static int gcd(int A, int B) {
		if (A == 0) {
			return B;
		}

		if (B == 0) {
			return A;
		}

		int result = 1;

		while (true) {
			int scd = smallestCommonDivisor(A, B);
			System.out.println("scd: " + scd);

			if (scd > 1) {
				result *= scd;
				A = A / scd;
				B = B / scd;
			}

			if (scd == 1) {
				break;
			}
		}

		return result;
	}

	public static int smallestCommonDivisor(int A, int B) {
		for (int i = 2; i <= (A < B ? A : B); i++) {
			if (A % i == 0 && B % i == 0) {
				return i;
			}
		}

		return 1;
	}

	public static int gcdBest(int A, int B) {
		int div = A > B ? A : B;
		while (true) {
			if (A % div == 0 && B % div == 0) {
				return div;
			}
			div--;
		}
	}
}
