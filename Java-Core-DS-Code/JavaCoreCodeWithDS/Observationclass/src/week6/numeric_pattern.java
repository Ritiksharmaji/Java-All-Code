package week6;
import java.util.*;

public class numeric_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number for n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				k=k+1;
				//System.out.print(j);
				System.out.print(k+" ");
			}
			System.out.println();
			
		}
		

	}

}
