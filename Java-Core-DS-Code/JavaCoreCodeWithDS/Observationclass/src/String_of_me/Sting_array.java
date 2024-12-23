package String_of_me;
import java.util.*;
public class Sting_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of string");
		n=sc.nextInt();
		String str[]=new String[n];
		System.out.println("enter string in array");
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		System.out.print("String=");
		for(int i=0;i<n;i++)
		{
			System.out.print(str[i]+" ");
		}
		
		

	}

}
