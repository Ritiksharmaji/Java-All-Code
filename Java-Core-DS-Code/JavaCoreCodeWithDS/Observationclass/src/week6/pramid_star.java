package week6;
import java.util.*;

public class pramid_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of n");
		n=sc.nextInt();
		System.out.println("for paramid pattern");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)  // this is for space
			{
				System.out.print(" ");
					
			}  
			for(k=1;k<=(2*i-1);k++) // this is for printing
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		

	}

}
