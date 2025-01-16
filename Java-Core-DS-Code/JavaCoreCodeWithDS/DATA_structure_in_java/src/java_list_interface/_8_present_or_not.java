package java_list_interface;
import java.util.ArrayList;
import java.util.List;
public class _8_present_or_not {
	 public static void main(String args[])
	    {
	        List<String> al = new ArrayList<>();
	        al.add("Geeks");
	        al.add("For");
	        al.add("Geeks");
	        boolean isPresent = al.contains("Geeks");
	        System.out.println("Is Geeks present in the list? "+ isPresent);
	    }
}
