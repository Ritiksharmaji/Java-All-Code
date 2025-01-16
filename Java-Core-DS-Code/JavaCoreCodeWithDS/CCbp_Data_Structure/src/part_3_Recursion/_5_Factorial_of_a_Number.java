package part_3_Recursion;

import java.util.Scanner;

public class _5_Factorial_of_a_Number {
	
	static int printFactorial(int n) {
		
		if( n == 1) {
			return 1;
		}
		
		return printFactorial(n-1) * n;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(printFactorial(a));
	}
	
}
