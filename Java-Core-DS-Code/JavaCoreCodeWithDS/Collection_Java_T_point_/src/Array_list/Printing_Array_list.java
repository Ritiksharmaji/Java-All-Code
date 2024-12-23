package Array_list;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * to print the array_List we can do
 * 1) normal way
 * 2) by for lop  
 * 3) by iterator method
 * 4) byt for each loop
 */
public class Printing_Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      //Printing the arraylist object
	      // 1) way
	      System.out.println("---by using the normal---");
	      System.out.println(list); 
	      // 2) way
	      
	      System.out.println("\n ---by using the for loop ---");
	      for(int i =0; i < list.size();i++)
	      {
	    	  String s = list.get(i);
	    	  System.out.print(s +" ");
	    	  
	      } 
	      
	      // way 3
	      Iterator it = list.iterator();
	      System.out.println("\n ---by using the iterator---");
	      while(it.hasNext())
	      {
	    	  System.out.print(it.next()+" ");
	      }
	      // way 4
	      System.out.println("\n ---by using the for in ---");
	      for(String s:list)
	      {
	    	  System.out.print(s+" ");
	      }
	}
}
