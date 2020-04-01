/**
 * <pre>
 * Given a number N >= 0, find its representation in binary.
 *
 * Example:
 * if N = 6,
 * binary form = 110
 * 
 *
 * 125를 10으로 나누면? 일의 자리를 없애는 것이다
 * 12를 10으로 나누면? 십의 자리를 없애는 것이다.
 * 1을 10으로 나누면? 백의 자리를 없애는 것이다.
 *
 * See <a href = "https://www.interviewbit.com/problems/binary-representation/">Binary Representation</a>
 * </pre>
 */
public class BinaryRepresentation {
	public static void main(String[] args) {
		System.out.println(findDigitsInBinary(10));
	}

	public static String findDigitsInBinary(int A) {
		StringBuilder result = new StringBuilder();

		if (A == 0) {
			return "0";
		}

		while (A > 0) {
			result.insert(0, (A % 2));
			A = A / 2;
		}

		return result.toString();
	}
}
