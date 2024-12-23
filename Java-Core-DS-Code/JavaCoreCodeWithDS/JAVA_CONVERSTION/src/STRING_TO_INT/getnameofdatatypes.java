package STRING_TO_INT;
import java.util.*; 
public class getnameofdatatypes {
	 
	// create class CheckDataTypeExample to check the datatype of the variable   
	    // main() method start  
	    public static void main(String args[]) {  
	                // declare variables  
	        int intData;  
	        char charData;  
	          
	        // create Scanner class object to take input from user  
	        Scanner sc = new Scanner(System.in);  
	          
	        // take input from the user to initialize variables  
	          
	        System.out.println("Enter a String value:");  
	        String str = sc.nextLine();  
	          
	        System.out.println("Enter Integer value:");  
	        intData = sc.nextInt();  
	          
	        System.out.println("Enter Character value:");  
	        charData = sc.next().charAt(0);  
	          
	        // close Scanner class object  
	        sc.close();  
	          
	        // show datatypes of variables by using getClass() and getSimpleName() methods  
	        System.out.println(intData + " is of type " + ((Object)intData).getClass().getSimpleName());  
	        System.out.println(charData + " is of type " + ((Object)charData).getClass().getSimpleName());  
	        System.out.println(str + " is of type " + str.getClass().getSimpleName());  
	    }  
	}  


