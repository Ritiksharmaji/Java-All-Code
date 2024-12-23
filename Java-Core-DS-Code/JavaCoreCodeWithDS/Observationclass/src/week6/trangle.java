package week6;
import java.util.*;

public class trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		System.out.println("enter number of n");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("for trangle pattern");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
