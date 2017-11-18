/**
 * Class: For a given array of price of items, calculate the sum and average of all prices up to 2 decimal places. 
 * @author Maddy
 * Ver 1.0 Sep 11, 2017 11:53:49 PM
 * I/P: 
 * 2
 * 5
 * 1 2 3 4 5
 * 9
 * 2 55 85 656 52 554 545 5 2
 */

package GeeksForGeeks;

import java.util.Scanner;

public class PricesSumAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num > 0) {
			int len = sc.nextInt();
			int sum = 0;
			for (int i = 0; i < len; i++) {
				sum += sc.nextInt();
			}
			System.out.println(String.valueOf(sum) + " " + String.format("%.2f", (double) sum / len));
			num--;
		}
	}
}
