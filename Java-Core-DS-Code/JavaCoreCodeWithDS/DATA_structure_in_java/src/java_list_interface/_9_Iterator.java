package java_list_interface;
import java.util.ArrayList;
import java.util.List;
public class _9_Iterator {
	public static void main(String args[])
    {
        List<String> al = new ArrayList<>();
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");
        // Using  for loop for iteration
        for (int i = 0; i < al.size(); i++) 
            System.out.print(al.get(i) + " ");
        System.out.println();

        // Using for-each loop for iteration
        for (String str : al)
            System.out.print(str + " ");
    }
}
