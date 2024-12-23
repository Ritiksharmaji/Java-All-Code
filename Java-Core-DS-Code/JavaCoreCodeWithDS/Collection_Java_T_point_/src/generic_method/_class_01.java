package generic_method;

import java.util.ArrayList;
import java.util.List;

public class _class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  creating the arraylist by using  the non-generic concept
		 */
		List arraylist = new ArrayList();
		
		arraylist.add(40);
		arraylist.add(50);
		arraylist.add(60);
		arraylist.add("titik");
		
		System.out.println(arraylist);
		
		/*
		 * creating a arralist by generic concept.
		 */
		List<Integer> arraylist2 = new ArrayList<Integer>();
		arraylist2.add(20);
		arraylist2.add(30);
		// arraylist2.add("golu");  error
		
		System.out.println(arraylist2);

	}

}
