package Array_list;

import java.util.ArrayList;

/*
 * Let's see an example to traverse the
 *  ArrayList elements using the for-each loop
 */
public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		
			list.add("ritik skarma");
		list.add("golu");
		 list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");
	      
	      System.out.println("this is by for in itereter loop");
	      for(String str:list)
	      {
	    	  System.out.println(str);
	      }

	}

}
