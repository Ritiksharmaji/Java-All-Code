package Array_with_ArrayList_with_Linklist;

import java.util.Scanner;

public class deletion_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,334,53,23,34,53,65};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the data to delete :");
		int data = sc.nextInt();
		int possion = -1;
		// to find the possition for that data
		
		for(int i =0; i<a.length;i++)
		{
			if(a[i] == data)
			{
				possion = i;
				continue;
			}
			
		}
		// if the element is found then create a new array
		if(possion != -1)
		{
			 int length = (a.length-1);
			 int[] newArray = new int[length];
			 
			for(int i =0,j=0 ; i< a.length; i++)
			{
				if( i == possion)
				{
					continue;
				}
				
				newArray[j++] = a[i];
				//System.out.print(newArray[i]);
			}
			for(int x:newArray)
			{
				System.out.print(x+" ");
			}
		}
		
		
		


	}

}
