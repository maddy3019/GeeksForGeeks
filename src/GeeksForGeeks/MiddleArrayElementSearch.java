/**
 * @author Maddy
 * Ver 1.0 Sep 14, 2017 5:05:47 PM
 * 
 */

package GeeksForGeeks;

import java.util.Scanner;

public class MiddleArrayElementSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while (num > 0) {
			int[] arr = new int[sc.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(findElement(arr));
			num--;
		}
	}

	/**
	 * @param arr
	 */
	private static int findElement(int[] arr) {
		boolean isMiddle = false;
		for (int j = 1; j < arr.length - 1; j++) {
			int currentMiddle = arr[j];
			int prev = j - 1;
			int next = j + 1;
			while (prev <= 0 && next < arr.length) {
				if (arr[prev] < currentMiddle && currentMiddle < arr[next]) {
					isMiddle = true;
					prev--;
					next++;
				} else {
					isMiddle = false;
					break;
				}
			}
			if (!isMiddle) {
				continue;
			} else {
				return (currentMiddle);
			}
			// for (int i = 0; i < j; i++) {
			// if (arr[i] < arr[j]) {
			// isMiddle = true;
			// } else {
			// isMiddle = false;
			// break;
			// }
			// }
			// for (int k = j + 1; k < arr.length; k++) {
			// if (arr[k] > arr[j]) {
			// isMiddle = true;
			// } else {
			// isMiddle = false;
			// break;
			// }
			// }
			// if (!isMiddle) {
			// continue;
			// } else {
			// return (arr[j]);
			// }
		}
		return -1;
	}
}
