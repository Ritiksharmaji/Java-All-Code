package Intro_;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Class_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> vectorlist = new Vector<String>();
		
		vectorlist.add("ushri");
		// vectorlist.add('A'); error
		vectorlist.add("hasanpura");
		vectorlist.add("siwan");
		vectorlist.add("Bisanpura");
		vectorlist.add("Nagpur");
		vectorlist.add("Kanpur");
		vectorlist.add("Bhopal");
		
		Iterator or = vectorlist.iterator();
		
		while(or.hasNext())
		{
			System.out.println(or.next());
		}

	}

}
