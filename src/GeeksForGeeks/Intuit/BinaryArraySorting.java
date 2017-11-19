/**
 * @author Maddy
 * Ver 1.0 Nov 19, 2017 1:31:20 AM
 * Given a binary array, sort it in non-decreasing order.
 * EX:
 * I/P:
 * 2
 * 5
 * 1 0 1 1 0
 * 10
 * 1 0 1 1 1 1 1 0 0 0
 * O/P:
 * 0 0 1 1 1
 * 0 0 0 0 1 1 1 1 1 1
 */

package GeeksForGeeks.Intuit;

import java.util.Scanner;

public class BinaryArraySorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int size = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			sort(arr, size);
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
			t--;
		}
	}

	private static void sort(int[] arr, int size) {
		int zeros = 0, ones = 0;

		// count zeros and ones
		for (int i = 0; i < size; i++) {
			if (arr[i] == 0) {
				zeros++;
			} else if (arr[i] == 1) {
				ones++;
			}
		}

		// put zeros from index 0 to index = number of zeros
		for (int i = 0; i < zeros; i++) {
			arr[i] = 0;
		}

		// put ones in the remaining array
		for (int i = zeros; i < zeros + ones; i++) {
			arr[i] = 1;
		}
	}
}
