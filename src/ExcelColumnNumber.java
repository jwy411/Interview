/**
 * @see <a href = "https://www.interviewbit.com/problems/excel-column-number/">Excel Column Number</a>
 */
public class ExcelColumnNumber {
	public static void main(String[] args) {
		System.out.println(titleToNumber("ZZ"));
	}

	public static int titleToNumber(String A) {
		int base = 26;
		int value = 0;


		for (int i = 0; i < A.length(); i++) {
			value += (A.charAt(i) - 'A' + 1) * Math.pow(base, A.length() - i - 1);
		}

		return value;
	}
}
