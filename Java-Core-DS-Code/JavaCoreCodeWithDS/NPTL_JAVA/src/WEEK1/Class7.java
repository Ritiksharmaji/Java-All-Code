package WEEK1;
import java.util.Scanner;

       
public class Class7 {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   int n=sc.nextInt();
		  int sum=0;
		//Use for or while loop do the operation.
		  int t;
		  for(int i=0;i<=n;i++)
		  		{
		  			t = 2*(i-1);
		  			if(t%3 == 0)
		  			{
		  				sum += t;
		  			}
		  		}
		  		System.out.print(sum);
}

}
