package collection.Interface_1_List.Class_1_ArrayList;
import java.util.ArrayList;
class ArrayList_CLass2_BasicOperation {
 public static void main(String args[]){
   
     // Creating an Array of string type
     ArrayList<String> al = new ArrayList<>();
   
       // 1. Addition
	     al.add("Geeks");
	     al.add("Geeks");
	     System.out.println("Orignal List : "+al);
       // Adding Elements at the specific index
	     al.add(1, "For");
	     System.out.println("After Adding element at index 1 : "+ al);
       
       // 2. Deletion of Element
       // Removing Element using index
	     al.remove(0);   
	     System.out.println("Element removed from index 0 : "+ al);       
       // Removing Element using the value
	     al.remove("Geeks");   
	     System.out.println("Element Geeks removed : "+ al);
   
       // 3. Updating Values       
       // Updating value at index 0
	     al.set(0, "GFG");
  
     // Printing all the elements in an ArrayList
     System.out.println("List after updation of value : "+al);
 }
}


