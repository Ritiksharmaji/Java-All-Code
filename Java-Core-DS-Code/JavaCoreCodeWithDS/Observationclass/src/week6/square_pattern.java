package week6;
import java.util.*;

public class square_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}

	}

}
