/**
 * @author Maddy
 * Ver 1.0 Nov 20, 2017 11:42:52 AM
 * Write a program to find the majority element in the array.
 * A majority element in an array A[] of size n is an element
 * that appears more than n/2 times (and hence there is at most one such element).
 * If input array doesn't contain a majority element, then output "NO Majority Element".
 * EX:
 * I/P:
 * 2
 * 5
 * 3 1 3 3 2
 * 3
 * 1 2 3
 * O/P:
 * 3
 * NO Majority Element
 */

package GeeksForGeeks;

import java.util.Scanner;

public class MajorityElement {
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
			int maj = findMajorityElement(arr, size);
			String str = isMajority(arr, maj, size) ? String.valueOf(maj) : "NO Majority Element";
			System.out.println(str);
			t--;
		}
	}

	/**
	 * @param arr
	 * @param maj
	 * @param size
	 * @return
	 */
	private static boolean isMajority(int[] arr, int maj, int size) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == maj) {
				count++;
			}
		}
		if (count > (size / 2)) {
			return true;
		}
		return false;
	}

	/**
	 * Method to find majority element (i.e. element with most number of occurrences
	 * 
	 * @param arr
	 * @param size
	 * @return
	 */
	private static int findMajorityElement(int[] arr, int size) {
		int count = 1;
		int majIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[majIndex]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				majIndex = i;
				count = 1;
			}
		}
		return arr[majIndex];
	}
}
