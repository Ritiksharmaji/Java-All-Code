package week4;

import java.util.Scanner;

public class Sum_of_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,sum=0;
		System.out.println("enter the number of element");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("for sum");
		
		for(i=0;i<n;i++)
		{
			sum=a[i]+sum;
		}
		System.out.println("sum"+sum);

	}

}
