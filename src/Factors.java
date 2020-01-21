import java.util.ArrayList;
import java.util.Collections;

/**
 * @see <a href="https://www.interviewbit.com/problems/all-factors/">All Factors</a>
 */
public class Factors {
	public static void main(String[] args) {
		System.out.println(allFactors(12));
	}

	public static ArrayList<Integer> allFactors(int A) {
		ArrayList<Integer> result = new ArrayList<>();

		double sqrt = Math.sqrt(A);

		for (int i = 1; i <= sqrt; i++) {
			if (A % i == 0) {
				result.add(i);

				if (i != sqrt) {
					result.add(A / i);
				}
			}
		}

		Collections.sort(result);
		return result;
	}


}


