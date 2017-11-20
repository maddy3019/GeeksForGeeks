/**
 * @author Maddy Ver 1.0 Nov 19, 2017 7:20:46 PM
 * 
 */

package GeeksForGeeks;

import java.util.Scanner;

public class ConsecutiveElementsURL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			String str = sc.next();
			System.out.println(urlify(str));
			t--;
		}
	}

	private static String urlify(String str) {
		String res = "";
		res += str.charAt(0);
		int i = 1;
		while (i < str.length()) {
			while (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
				i++;
			}
			if (i < str.length()) {
				res += str.charAt(i);
			}
			i++;
		}
		return res;
	}
}
