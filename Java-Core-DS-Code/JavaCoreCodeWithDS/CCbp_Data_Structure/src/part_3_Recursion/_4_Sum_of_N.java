package part_3_Recursion;

import java.util.Scanner;

public class _4_Sum_of_N {
	
	 static int recursionSum(int n) {
		 // base case..
	        if (n == 1) {
	            return 1;
	        }
	        return recursionSum(n - 1) + n;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a number
	        int n = scanner.nextInt();

	        // Call the recursive sum function
	        System.out.println(recursionSum(n));
	    }

}
