package String;
import java.util.StringTokenizer; 

public class Stringtoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* StringTokenizer object */ 
		 StringTokenizer st = new StringTokenizer("Demonstrating methods from StringTokenizer class"," "); 
		 /* Checks if the String has any more tokens */ 
		 while (st.hasMoreTokens()) 
		 { 
		 System.out.println(st.nextToken()); 
		 } 

	}

}
