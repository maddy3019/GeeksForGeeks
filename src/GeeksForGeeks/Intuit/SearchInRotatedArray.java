/**
 * @author Maddy
 * Ver 1.0 Nov 20, 2017 3:20:48 AM
 * Given a sorted and rotated array (rotated at some point) A[ ], and given an element K,
 * the task is to find the index of the given element K in the array A[ ].
 * The array has no duplicate elements. If the element does not exist in the array, print -1.
 * EX:
 * I/P:
 * 3
 * 9
 * 5 6 7 8 9 10 1 2 3
 * 10
 * 3
 * 3 1 2
 * 1
 * 4
 * 3 5 1 2
 * 6
 * O/P:
 * 5
 * 1
 * -1
 */

package GeeksForGeeks.Intuit;

import java.util.Scanner;

public class SearchInRotatedArray {
	/**
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
			int key = sc.nextInt();
			System.out.println(findElement(arr, 0, size - 1, key));
			t--;
		}
	}

	/**
	 * Returns index of key in arr[l..h] and return -1 if key not present in arr[].
	 * 
	 * @param arr
	 * @param l
	 * @param h
	 * @param key
	 * @return
	 */
	private static int findElement(int[] arr, int l, int h, int key) {
		if (l > h) {
			return -1;
		}

		// find mid index of array
		int mid = (l + h) / 2;
		if (arr[mid] == key) {
			return mid;
		}

		// if arr[l..mid] is sorted
		if (arr[l] <= arr[mid]) {
			// search for key, first in sub-array to the left of the mid index
			// then in sub-array to the right of the mid index
			if (key >= arr[l] && key <= arr[mid]) {
				return findElement(arr, l, mid - 1, key);
			}
			return findElement(arr, mid + 1, h, key);
		}

		// search for key, first in sub-array to the right of the mid index
		// then in sub-array to the left of the mid index
		if (key >= arr[mid] && key <= arr[h]) {
			return findElement(arr, mid + 1, h, key);
		}
		return findElement(arr, l, mid - 1, key);
	}
}
