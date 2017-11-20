/**
 * @author Maddy
 * Ver 1.0 Nov 19, 2017 10:37:19 PM
 * 
 */

package GeeksForGeeks.Intuit;

import java.util.ArrayList;
import java.util.Scanner;

public class StockBuySell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int size = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(toString(buySell(arr, size)));
			t--;
		}
	}

	private static String toString(ArrayList<int[]> res) {
		String days = "No Profit";
		if (res != null && res.size() != 0) {
			days = "";
			for (int[] i : res) {
				days += "(" + i[0] + " " + i[1] + ")" + " ";
			}
		}
		return days;
	}

	private static ArrayList<int[]> buySell(int[] arr, int size) {
		ArrayList<int[]> res = new ArrayList<int[]>();
		if (size == 1) {
			return null;
		}
		int i = 0;
		while (i < size) {
			int[] r = new int[2];

			// finding local minima
			while ((i < size - 1) && (arr[i + 1] <= arr[i])) {
				i++;
			}
			if (i == size - 1) {
				break;
			}
			// storing local minima as buy value
			r[0] = i++;

			// finding local maxima
			while ((i < size - 1) && (arr[i + 1] >= arr[i])) {
				i++;
			}

			// storing local maxima as sell value
			r[1] = i++;
			res.add(r);
		}
		return res;
	}
}
