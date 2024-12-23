package Intro_;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> linkedlistt = new LinkedList<String>();
		
		linkedlistt.add("Ritik sharma");
		linkedlistt.add("Golu sharma");
		linkedlistt.add("Priyanshu sharma");
		linkedlistt.add("Ankit sharma");
		linkedlistt.add("Shyam Babu sharma");
		linkedlistt.add("Rohit sharma");
		linkedlistt.add("Ritik sharma");
		
		Iterator or=linkedlistt.iterator();
		while(or.hasNext())
		{
			System.out.println(or.next());
		}
		

	}

}
