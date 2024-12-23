package week9;
import java.util.*;

public class FindSecondlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,t,n;
		int second;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("for sorting ");
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
		
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		
		int beg=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>beg)
			{
				beg=a[i];
			}
		}
		//second=a[-1];
		System.out.println("large="+beg);
		//System.out.println("second large="+second);
		
		

	}

}
