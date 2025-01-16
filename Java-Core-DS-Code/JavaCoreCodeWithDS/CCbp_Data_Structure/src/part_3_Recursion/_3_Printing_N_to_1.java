package part_3_Recursion;

import java.util.Scanner;

public class _3_Printing_N_to_1 {

	static void print(int i, int n){
        if(i == n+1){
            return;
        }else{
        	
            print(i+1,n);
            System.out.println(i);
            
        }
    }
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    print(1,n);
  }
}
