# GeeksForGeeks Interview Questions

### String/Array

1. #### **Special array reversal**:

   Given a string **S**, containing special characters and all the alphabets, reverse the string without
   affecting the positions of the special characters.

   **Input**
   The first line of input contains an integer **T** denoting the number of test cases. Then **T** test cases
   follow. 
   The first line of each test case contains a case-insensitive string **S**.

   **Output**
   Print out the reversed string without  affecting special characters.

   **Example:**

   > ```
   > Input:
   > 3
   > A&B
   > abc%sld*
   > dakA&*hA@#N
   > Output:
   > B&A
   > dls%cba*
   > NAhA&*ka@#d
   > ```
   >


   **Solution 1:**

   > ```java
   > import java.util.*;
   > import java.lang.*;
   > import java.io.*;
   > 
   > class GFG {
   > 	public static void main (String[] args) {
   > 		Scanner sc = new Scanner(System.in);
   > 		int t = sc.nextInt();
   > 		while (t-- > 0) {
   > 		    System.out.println(reverseSpecial(sc.next()));
   > 		}
   > 	}
   > 	
   > 	private static reverseSpecial (String str) {
   > 	    char[] ch = str.toCharArray();
   > 	    int l = 0, r = str.length - 1;
   > 	    while (l < r) {
   > 	        if (!Character.isAlphabetic(ch[l])) {
   > 	            l++;
   > 	        } else if (!Character.isAlphabetic(ch[r])) {
   > 	            r--;
   > 	        } else {
   > 	            char temp = ch[l];
   > 	            ch[l] = ch[r];
   > 	            ch[r] = temp;
   > 	            l++;
   > 	            r--:
   > 	        }
   > 	    }
   > 	    return String.valueOf(ch);
   > 	}
   > }
   > ```

   
