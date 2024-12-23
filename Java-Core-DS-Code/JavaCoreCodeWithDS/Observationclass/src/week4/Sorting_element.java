package week4;
import java.util.*;

public class Sorting_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,t;
		System.out.println("enter the number of element");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("after sorting the element=");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}
