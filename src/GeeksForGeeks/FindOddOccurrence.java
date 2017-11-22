/**
 * @author Maddy
 * Ver 1.0 Nov 21, 2017 6:35:04 PM
 * Given an array of positive integers.
 * All numbers occur even number of times except one number which occurs odd number of times. Find the number.
 * EX:
 * I/P:
 * 1
 * 5
 * 8 4 4 8 23
 * O/P:
 * 23
 */

package GeeksForGeeks;

import java.util.Scanner;

public class FindOddOccurrence {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int size = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(findOddOccurence(arr, size));
			t--;
		}
	}

	/**
	 * Method to find odd occurrence of the number in arr. Trick = XOR
	 * 
	 * @param arr
	 * @param size
	 * @return
	 */
	private static String findOddOccurence(int[] arr, int size) {
		int x = 0;
		for (int i = 0; i < size; i++) {
			x ^= arr[i];
		}
		return String.valueOf(x);
	}
}
