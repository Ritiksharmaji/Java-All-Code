package part_3_Recursion;

import java.util.Scanner;

public class _2_Printing_1_to_N {

	 static void print(int i, int n){
	        if(i == n+1){
	            return;
	        }else{
	        	System.out.println(i);
	            print(i+1,n);
	            
	        }
	    }
	    
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    print(1,n);
	  }
}
