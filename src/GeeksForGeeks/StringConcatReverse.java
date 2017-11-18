/**
 * Class: Concatenate two strings and print reversed string.
 * @author Maddy
 * Ver 1.0 Sep 11, 2017 9:00:55 PM
 * I/P:
 * 2
 * Geeks
 * forGeeks
 * Practice
 * geeks
 */

package GeeksForGeeks;

import java.util.Scanner;

public class StringConcatReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num > 0) {
			String s1 = sc.next();
			String s2 = sc.next();
			s2 = s1.concat(s2);
			for (int i = s2.toCharArray().length - 1; i >= 0; i--) {
				System.out.print(s2.toCharArray()[i]);
			}
			System.out.println();
			num--;
		}
	}
}
