package week5;

import java.util.Scanner;

public class matrix_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,r,col,k;
		//System.out.println("enter the number of row");
		Scanner sc=new Scanner(System.in);
		//r=sc.nextInt();
		//System.out.println("enter the number of columns");
		//col=sc.nextInt();
		int a[][]=new int[3][3];
		int b[][]=new int [3][3];
		int c[][]=new int[3][3];
		System.out.println("enter the element of 1st matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the element of 2st matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=0;
				for(k=0;k<3;k++)
				{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		//c[i][j]=0;
		/*for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
		}
			System.out.println();
		}  */
	

	}

}
