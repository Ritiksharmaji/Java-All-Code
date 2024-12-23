package week5;
import java.util.Scanner;

public class find_beggest_and_smallest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of element");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		// for finding biggest
		int big=a[0];
		for(i=1;i<n;i++)
		{
			//a[i]=sc.nextInt();
			
			if(big<a[i])
			{
				big=a[i];
			}
		}
		int small=a[0];
		for(i=0;i<n;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println("for finding");
		
			System.out.println("biggest element ="+big);
			System.out.println("smallest element ="+small);

	}

}
