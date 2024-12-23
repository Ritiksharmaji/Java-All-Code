package STRING_TO_INT;

public class NumberFormatException_Case {
	//Java Program to demonstrate the case of NumberFormatException   
	public static void main(String args[]){  
	String s="hello";  
	try {
	int i=Integer.parseInt(s);  
	System.out.println(i);
	}
	catch(Exception e)
	{
		System.out.println("exception catched");
		System.out.println(e);
	}
	} 

}
