/**
 * @author Maddy
 * Ver 1.0 Nov 18, 2017 3:48:57 PM
 * Given an array of size n-1 and given that there are numbers from 1 to n with one missing,
 * the missing number is to be found.
 * EX:
 * 2
 * 5
 * 1 2 3 5
 * 10
 * 1 2 3 4 5 6 7 8 10
 * O/P:
 * 4
 * 9
 */

package GeeksForGeeks.Intuit;

import java.util.Scanner;

public class MissingNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int size = sc.nextInt();
			int[] arr = new int[size - 1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(returnMissingElement(arr, size));
			t--;
		}
	}

	private static int returnMissingElement(int[] arr, int size) {
		// calculate possible sum total of all array elements without any missing number
		int total = size * (size + 1) / 2;
		for (int i = 0; i < arr.length; i++) {
			// subtract each array element
			total -= arr[i];
		}
		// return the remaining total which contains missing element that should be
		// added to the array to make total
		return total;
	}
}
