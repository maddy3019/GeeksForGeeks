/**
 * @author Maddy
 * Ver 1.0 Nov 18, 2017 11:33:47 PM
 * Given a word and a text, return the count of the occurences of anagrams of the word in the
 * text(For eg: anagrams of word for are for, ofr, rof etc.))
 * EX:
 * I/P:
 * 2
 * forxxorfxdofr
 * for
 * aabaabaa
 * aaba
 * O/P:
 * 3
 * 4
 */

package GeeksForGeeks.Intuit;

import java.util.Scanner;

public class AnagramOccurences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			String text = sc.next();
			String pattern = sc.next();
			System.out.println(printAnagramOccurences(text, pattern));
			t--;
		}
	}

	private static int printAnagramOccurences(String text, String pattern) {
		int occurences = 0;
		if (text.length() < pattern.length()) {
			return -1;
		}
		char[] countPattern = new char[256];
		char[] countText = new char[256];
		// store the character frequencies of pattern and
		// text(first window of length equal to that of pattern's)
		for (int i = 0; i < pattern.length(); i++) {
			countPattern[pattern.charAt(i)]++;
			countText[text.charAt(i)]++;
		}

		for (int j = pattern.length(); j < text.length(); j++) {
			// compare if current window is an anagram of pattern
			if (compare(countPattern, countText)) {
				occurences++;
			}

			// add current char to the window
			countText[text.charAt(j)]++;
			// remove first char of the current window
			countText[text.charAt(j - pattern.length())]--;
		}

		// compare for last window which is missed in above iteration
		if (compare(countPattern, countText)) {
			occurences++;
		}
		return occurences;
	}

	private static boolean compare(char[] countPattern, char[] countText) {
		for (int i = 0; i < 256; i++) {
			if (countPattern[i] != countText[i]) {
				return false;
			}
		}
		return true;
	}
}
