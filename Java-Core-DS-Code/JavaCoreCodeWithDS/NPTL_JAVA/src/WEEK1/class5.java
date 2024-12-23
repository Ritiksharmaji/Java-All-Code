package WEEK1;
/* AIM-1 Complete the code segment to help Ragav , find the 
 * highest mark and average mark secured by 
 * him in "s" number of subjects.
 */
import java.util.Scanner;
    

public class class5 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	         double mark_avg;
	         int result;
	         int i;
	         int s;
	      //define size of array
	         System.out.println("enter size of array");
	       s = input.nextInt();
	     //The array is defined "arr" and inserted marks into it.
	      int[] arr = new int[s];
	      System.out.println("enter integer element in array");
	      for(i=0;i<arr.length;i++)
		  {
		arr[i]=input.nextInt();
	        }
	    //Initialize maximum element as first element of the array.  
	      //Traverse array elements to get the current max.
	      //Store the highest mark in the variable result.
	      //Store average mark in avgMarks.
	   int a=arr[0];
	   for(i=1;i<arr.length;i++)
	   	  {
	   	if(arr[i]>a)
	       {
	         a=arr[i];
	       }
	     
	        }
	   int sum=0;
	   for(i=0;i<arr.length;i++)
	   	  {
	   sum=sum+arr[i];
	           }
	   mark_avg=sum/s;
	   System.out.println(a);
	   System.out.print(mark_avg);



}
}
