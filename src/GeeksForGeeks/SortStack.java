/**
 * @author Maddy
 * Ver 1.0 Sep 14, 2017 4:07:20 PM
 * 
 */

package GeeksForGeeks;

import java.util.Stack;

public class SortStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(21);
		s.push(3);
		s.push(13);
		sort(s);
		for (Integer x : s) {
			System.out.println(x);
		}
	}

	/**
	 * @param s
	 * @return s
	 */
	private static Stack<Integer> sort(Stack<Integer> s) {
		sortStack(s);
		return s;
	}

	/**
	 * @param s
	 */
	private static void sortStack(Stack<Integer> s) {
		if (s.empty())
			return;
		int curr = s.pop();
		sortStack(s);
		insertSorted(s, curr);
	}

	/**
	 * @param s
	 * @param curr
	 */
	private static void insertSorted(Stack<Integer> s, int a) {
		if (s.empty() || a > s.peek()) {
			s.push(a);
			return;
		}
		int curr = s.pop();
		insertSorted(s, a);
		s.push(curr);
	}
}
