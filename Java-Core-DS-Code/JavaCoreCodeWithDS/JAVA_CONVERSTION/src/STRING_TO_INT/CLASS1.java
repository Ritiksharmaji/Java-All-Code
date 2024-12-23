package STRING_TO_INT;

public class CLASS1 {
	//Java Program to demonstrate the conversion of String into int  
	//using Integer.parseInt() method    
	public static void main(String args[]){  
	//Declaring String variable  
	String s="200";  
	//Converting String into int using Integer.parseInt()  
	int i=Integer.parseInt(s);  
	//Printing value of i  
	System.out.println(i);  
	 System.out.println(i+ " is of type " + ((Object)i).getClass().getSimpleName());  
	}  

}
