package Array_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * creating a arralist with non-generic concept
		 */
		ArrayList arraylst =new ArrayList();
		
		arraylst.add("ritik shram");
		arraylst.add("golu shrma");
		
		arraylst.add(40);
		/*
		 * but when we are trying to write
		 * arraylst.add(40); 
		 * then it will can't short but basically it has to
		 * do beacuse it non-generic support to add diffrent data type element 
		 * at time so also has to perfoms all operation that is why we are 
		 * having the generic concept 
		 */
		arraylst.add("polu kumar");
		arraylst.add("ram ji");
		arraylst.add("sita ji");
		Collections.sort(arraylst);
		
		
		System.out.println(arraylst);

	}

}
