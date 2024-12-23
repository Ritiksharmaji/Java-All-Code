package WEEK1;
/*aim 2
 * Consider First n even numbers starting from zero(0).
 * Complete the code segment to calculate sum of  all 
 * the numbers divisible by 3 from 0 to n. Print the sum.


Example:

Input: n = 5

-------
0 2 4 6 8
Even number divisible by 3:0 6
sum:6
 */
import java.util.Scanner;
public class CLASS6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			   Scanner sc = new Scanner(System.in);
			   System.out.println("enter size of array");
			   int n=sc.nextInt();
			   int sum=0;
			//Use for or while loop do the operation.

			  int arr[]=new int[n];
			  int brr[]=new int[n];
			  int a=0,j=0;
			  System.out.println("enter element of array");
			  for(int i=0;i<n;i++)
			  {
			    
			   arr[i]=sc.nextInt();
			    
			  }
			  //for even number
			  for(int i=0;i<n;i++)
			  {
			    if(arr[i]%2==0)
			    {
			      brr[j]=arr[i];
			      j++;
			    }
			    
			    
			  }
			  // for display the even number
			  for(int i=0;i<n;i++)
			  {
			    
			    System.out.print(brr[i]);
			    
			    
			  }
			  System.out.println();

			  // for sum
			  for(int i=0;i<n;i++)
			  {
			    if(brr[i]/3==0)
			    {
			   
			    sum=sum+brr[i];
			    }
			    
			  }


			  System.out.println(sum);
			   
			  
			  
			  
	  }
}
