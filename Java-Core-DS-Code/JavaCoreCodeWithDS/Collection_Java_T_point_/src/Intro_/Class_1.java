package Intro_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(30);
		arraylist.add(50);
		arraylist.add(40);
		arraylist.add(60);
		arraylist.add(70);
		arraylist.add(80);
		
		/*
		 * System.out.println(arraylist);
		 *  it will display all element 
		 *  output 
		 *  [30, 50, 40, 60, 70, 80]
		 *  
		 */
		Iterator or=arraylist.iterator();
		
		while(or.hasNext())
		{
			System.out.println(or.next());
		}
		
		

	}

}
