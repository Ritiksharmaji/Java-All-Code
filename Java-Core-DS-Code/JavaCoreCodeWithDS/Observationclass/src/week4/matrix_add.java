package week4;

import java.util.Scanner;

public class matrix_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,r,col;
		System.out.println("enter the number of row");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		System.out.println("enter the number of columns");
		col=sc.nextInt();
		int a[][]=new int[r][col];
		int b[][]=new int [r][col];
		int c[][]=new int[r][col];
		System.out.println("enter the element of 1st matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<col;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the element of 2st matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<col;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("for addition");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<col;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
