package java_list_interface;

import java.util.ArrayList;
import java.util.List;
public class _4_Updating_Elements {

	 public static void main(String args[])
	    {
	        // Creating an object of List interface
	        List<String> al = new ArrayList<>();
	        // Adding elements to object of List class
	        al.add("Geeks");
	        al.add("Geeks");
	        al.add(1, "Geeks");

	        // Display theinitial elements in List
	        System.out.println("Initial ArrayList " + al);

	        // Setting (updating) element at 1st index using set() method
	        al.set(1, "For");
	        System.out.println("Updated ArrayList " + al);
	    }
}
