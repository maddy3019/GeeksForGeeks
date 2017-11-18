/**
 * 
 */
package GeeksForGeeks;

import java.util.HashSet;

/**
 * @author Maddy Ver 1.0 Oct 27, 2017 8:14:38 AM
 * 
 */
public class StringPermutation {

	private static HashSet<String> permutations = new HashSet<String>();

	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		permute(str, 0, n - 1);
		for (String p : permutations) {
			System.out.println(p);
		}
	}

	/**
	 * permutation function
	 * 
	 * @param str
	 *            string to calculate permutation for
	 * @param l
	 *            starting index
	 * @param r
	 *            end index
	 */
	private static void permute(String str, int l, int r) {
		if (l == r) {
			permutations.add(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	/**
	 * Swap Characters at position
	 * 
	 * @param a
	 *            string value
	 * @param i
	 *            position 1
	 * @param j
	 *            position 2
	 * @return swapped string
	 */
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
