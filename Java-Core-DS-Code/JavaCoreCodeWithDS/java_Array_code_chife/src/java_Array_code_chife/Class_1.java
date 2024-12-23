package java_Array_code_chife;
/*
 * 
 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testcase, digit;
		
		
		System.out.println("enter the number of test case:");
		Scanner sc=new Scanner(System.in);
		testcase=sc.nextInt();
		//
		
		for(int i=0; i<testcase;i++)
		{
			int total=0;
			System.out.println("this is for "+(i+1)+"testcase");
			
			System.out.println("enter the total number of digit");
			digit=sc.nextInt();
			
			int array[]=new int[digit];
			System.out.println("enter numbers");
			// storing all the element in a array
			for(int j=0; j<digit; j++)
			{
				array[j]=sc.nextInt();
			}
			for(int j=1; j<(digit);j++)
			{
				if(array[j] > array[j-1])
				{
					total=total+1;
				}
			}
			
			if(total == (digit-1))
			{
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			System.out.println(total);
			
		}
		
		
		
		
		
		
		
		

	}

}
