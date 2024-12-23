package String;
import java.lang.*;

public class Stringbufer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj=new StringBuffer("ritik");
		System.out.println(obj);
		obj.setCharAt(3, 'g');   // SetCharAt is used to convert the particular string in given string by ushin index value
		System.out.println(obj);
		StringBuffer obj2=new StringBuffer("sharma");
		obj.append(obj2);  // append is ushed to add another string in given string
		System.out.println(obj);
		obj.insert(5, "ji");
		System.out.println(obj);
		

	}

}
