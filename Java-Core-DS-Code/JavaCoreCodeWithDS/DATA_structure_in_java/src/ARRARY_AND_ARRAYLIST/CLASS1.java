package ARRARY_AND_ARRAYLIST;

import java.util.*;
public class CLASS1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arry=new int[5];
		// for writing the element.
		
		for(int i=0;i<arry.length;i++)
		{
			arry[i]=sc.nextInt();
		}
		
		// for reading 
		
		for(int num:arry)
		{
			System.out.print(num+" ");
		}

	}

}
