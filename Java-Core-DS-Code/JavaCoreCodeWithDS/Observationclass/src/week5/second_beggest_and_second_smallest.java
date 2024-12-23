package week5;
import java.util.Scanner;
import java.util.Arrays;
public class second_beggest_and_second_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("enter number of elemnt");
		n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("enter elemnet");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("second smallest="+a[1]);
		System.out.println("second largesst="+a[n-2]);

	}

}
