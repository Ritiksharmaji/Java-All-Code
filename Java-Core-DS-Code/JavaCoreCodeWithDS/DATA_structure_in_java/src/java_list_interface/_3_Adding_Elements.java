package java_list_interface;
import java.util.ArrayList;
import java.util.List;
public class _3_Adding_Elements {
	 public static void main(String args[])
	    {
	        // Creating an object of List interface,
	        // implemented by ArrayList class
	        List<String> al = new ArrayList<>();

	        // Adding elements to object of List interface Custom elements
	        al.add("Geeks");
	        al.add("Geeks");
	        al.add(1, "For");

	        // Print all the elements inside the List interface object
	        System.out.println(al);
	    }    
}
