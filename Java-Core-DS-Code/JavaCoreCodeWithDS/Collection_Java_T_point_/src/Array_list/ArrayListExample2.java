package Array_list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Let's see an example to traverse ArrayList elements using 
 * the Iterator interface.
 */
public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("ritik skarma");
		list.add("golu");
		 list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");
	      
	      Iterator it=list.iterator();
	      
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());
	      }

	}

}
