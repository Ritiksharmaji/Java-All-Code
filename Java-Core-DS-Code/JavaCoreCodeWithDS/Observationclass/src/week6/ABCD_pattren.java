package week6;
import java.util.*;

public class ABCD_pattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		int alpha=64;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of n");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				alpha=alpha+1;
				System.out.print((char)(alpha)+" ");
				
			}
			System.out.println();
		}

	}

}
