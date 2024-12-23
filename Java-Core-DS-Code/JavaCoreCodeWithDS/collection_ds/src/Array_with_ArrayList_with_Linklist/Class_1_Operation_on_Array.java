package Array_with_ArrayList_with_Linklist;

import java.util.Scanner;
/*
 * operation on array
 * 1)inserting
 * 2)deletion
 * 3)traversion
 * 4)sorting
 * 5)searching
 */
public class Class_1_Operation_on_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a[]= {12,334,53,23,34,53,65};
		/*
		 * for insertion
		 */
		int k,n,item;
		System.out.println("enter the item to insert in array:");
		item = sc.nextInt();
		System.out.println("enter possition between the 0 :"+a.length);
		k = sc.nextInt();
		n = a.length; // to store the total length of array in n variable
		
		for(int i=0;i<n; i++)
		{
			if(i == k)
			{
				a[i-1]=item;
			}
		}
		// for printing the values
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		
		/*
		 * for deletion
		 */
		
		System.out.println("enter the possition between 0:"+a.length);
		k = sc.nextInt();
		int b[] = a;
		for(int i=1; i<=n;i++)
		{
			if( i == k)
			{
				
				continue;
			}
			else {
				b[i]= a[i];
			}
			
		}
		

	}

}
