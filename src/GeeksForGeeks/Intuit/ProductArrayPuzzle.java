/**
 * @author Maddy
 * Ver 1.0 Nov 19, 2017 1:07:33 AM
 * Given an array arr[] of n integers, construct a Product Array prod[] (of same size)
 * such that prod[i] is equal to the product of all the elements of arr[] except arr[i].
 * EX:
 * I/P:
 * 2
 * 5
 * 10 3 5 6 2
 * 2
 * 12 20
 * O/P:
 * 180 600 360 300 900
 * 20 12
 */

package GeeksForGeeks.Intuit;

import java.util.Scanner;

public class ProductArrayPuzzle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int size = sc.nextInt();
			int[] arr = new int[size];
			int[] product = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			buildProductArray(arr, size, product);
			for (int p : product) {
				System.out.print(p + " ");
			}
			System.out.println();
			t--;
		}
	}

	private static void buildProductArray(int[] arr, int size, int[] product) {
		int[] left = new int[size];
		int[] right = new int[size];
		// leftmost element of left array is always 1
		left[0] = 1;
		// rightmost element of right array is always 1
		right[size - 1] = 1;

		// construct left array
		for (int i = 1; i < size; i++) {
			left[i] = arr[i - 1] * left[i - 1];
		}

		// construct right array
		for (int i = size - 2; i >= 0; i--) {
			right[i] = arr[i + 1] * right[i + 1];
		}

		// construct product array
		for (int i = 0; i < size; i++) {
			product[i] = left[i] * right[i];
		}
	}
}
