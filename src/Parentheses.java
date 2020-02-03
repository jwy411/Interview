import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://www.interviewbit.com/problems/generate-all-parentheses-ii">Generate all Parentheses II</a>
 */
public class Parentheses {
	public static void main(String[] args) {
		System.out.println(generateParenthesis(5));
	}

	public static ArrayList<String> generateParenthesis(int A) {
		ArrayList<String> results = new ArrayList<>();
		add(results, "", true, A, 0, 0);
		return results;
	}

	private static void add(List<String> results, String result, boolean isOpen, int n, int open, int close) {
		if (isOpen) {
			result += '(';
			open++;
		} else {
			result += ')';
			close++;
		}

		if (open < n) {
			add(results, result, true, n, open, close);
		}

		if (open > close && close < n) {
			add(results, result, false, n, open, close);
		}

		if (open == n && close == n) {
			results.add(result);
		}
	}

}