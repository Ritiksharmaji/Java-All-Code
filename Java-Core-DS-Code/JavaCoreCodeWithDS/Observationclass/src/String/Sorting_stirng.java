package String;
import java.io.*;
import java.util.*;
public class Sorting_stirng {

	        public static void main(String ar[])
	    {
	        int i, j;
	    System.out.println("Enter number of strings : ");
	    Scanner s = new Scanner(System. in);
	    int n = s.nextInt();
	    String a[] = new String[n];
	    System.out.println("Enter"+n +"Strings:");
	    for (i=0;i < n;i++)
	    {
	        a[i]=s.next();
	    }
	    for (i=0;i < n;i++)
	    {
	    for (j=i+1;j < n;j++)
	    {
	    if (a[i].compareTo(a[j]) > 0)
	    {
	    String temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	    }
	    }
	    }
	    System.out.println("Names after sorting  : ");
	    for (j=0;j < n;j++)
	    System.out.println(a[j]);

	    }
	    }
