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
		add(results, "", true, A);
		return results;
	}

	private static void add(List<String> results, String result, boolean isOpen, int n) {
		if (isOpen) {
			result += '(';
		} else {
			result += ')';
		}

		int open = 0;
		int close = 0;

		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) == '(') {
				open++;
			}
			if (result.charAt(i) == ')') {
				close++;
			}
		}

		if (open < n) {
			add(results, result, true, n);
		}

		if (close < n) {
			if (open > close) {
				add(results, result, false, n);
			}
		}

		if (open == n && close == n) {
			results.add(result);
		}
	}

}