package java_list_interface;

import java.util.ArrayList;
import java.util.List;
public class _6_Removing_Elements {
	 public static void main(String args[])
	    {
	        // Creating List class object
	        List<String> al = new ArrayList<>();
	        al.add("Geeks");
	        al.add("Geeks");
	        al.add(1, "For");
	        System.out.println("Initial ArrayList " + al);
	        al.remove(1);
	        System.out.println("After the Index Removal " + al);
	        al.remove("Geeks");
	        System.out.println("After the Object Removal " + al);
	    }
}
