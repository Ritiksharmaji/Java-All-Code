package java_list_interface;
import java.util.List;
import java.util.Stack;
public class _12_Stack {

	 public static void main(String[] args)
	    {
	        int n = 5;
	        List<Integer> s = new Stack<Integer>();
	        for (int i = 1; i <= n; i++)
	            s.add(i);
	        System.out.println(s);
	        // Remove element at index 3
	        s.remove(3);
	        System.out.println(s);
	        for (int i = 0; i < s.size(); i++)
	            System.out.print(s.get(i) + " ");
	    }
}
