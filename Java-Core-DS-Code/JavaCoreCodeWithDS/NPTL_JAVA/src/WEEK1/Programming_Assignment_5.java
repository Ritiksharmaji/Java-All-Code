package WEEK1;
//to find the largest among three numbers x,y, and z.
//You should use if-then-else construct in Java.
import java.util.*;
public class Programming_Assignment_5 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		        int x = s.nextInt(); 
		        int y = s.nextInt();
		        int z = s.nextInt();
		        int result = 0;
		        if(x>y&&x>z)
		        {
		        	System.out.println("large nnumber="+x);
		        	
		        }
		        else if(y>x&&y>z)
		        {
		        	System.out.println("large number="+y);
		        }
		        else
		        {
		        	System.out.println("large="+z);
		        }
		
	}

}
