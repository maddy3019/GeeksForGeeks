/**
 * @author Maddy
 * Ver 1.0 Nov 18, 2017 3:21:27 PM
 * Given an unsorted array of non-negative integers, find a continuous sub-array which adds to a given number.
 * EX:
 * I/P:
 * 2
 * 5 12
 * 1 2 3 7 5
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 * O/P:
 * 2 4
 * 1 5
 */

package GeeksForGeeks.Intuit;

import java.util.Scanner;

public class SubArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int size = sc.nextInt();
			int sum = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(findSubArray(arr, size, sum));
			t--;
		}
	}

	private static String findSubArray(int[] arr, int size, int sum) {
		int currentSum = arr[0], start = 0;
		for (int i = 1; i <= size; i++) {
			// check if current sum exceeds target sum, then remove starting elements
			while (currentSum > sum && start < i - 1) {
				currentSum -= arr[start];
				start++;
			}

			// if current sum equals target sum, then print the start and end index
			if (currentSum == sum) {
				String result = "Subarray with sum: " + sum + " found between: " + (start + 1) + " and " + i;
				return result;
			}

			// add current element to current sum
			if (i < size) {
				currentSum += arr[i];
			}
		}
		return "Array not found.";
	}
}
