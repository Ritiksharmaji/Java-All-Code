package collection.Interface_1_List.Class_2_LinkedList;
import java.util.LinkedList;
public class LinkedList_Class5_Iterating {
 public static void main(String[] args) {
     // Creating a LinkedList
     LinkedList<String> ll = new LinkedList<String>();
     ll.add("Geeks"); 
     ll.add("Geeks"); 
     ll.add(1, "For"); 
     for (int i = 0; i < ll.size(); i++) { 
         System.out.print(ll.get(i) + " "); 
     } 

     System.out.println(); 
     // Using the for each loop 
     for (String str : ll) 
         System.out.print(str + " "); 
 }
}
