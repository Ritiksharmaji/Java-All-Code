package week6;
import java.util.*;

public class AABBCC_partern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,alpha=65;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((char) alpha+" ");
				
			}
			System.out.println();

			alpha=alpha+1;
		}

	}

}
