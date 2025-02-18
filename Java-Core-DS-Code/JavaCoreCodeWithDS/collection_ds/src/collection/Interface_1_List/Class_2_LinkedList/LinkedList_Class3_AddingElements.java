package collection.Interface_1_List.Class_2_LinkedList;
import java.util.LinkedList;
public class LinkedList_Class3_AddingElements {
 public static void main(String[] args) {
     // Creating a LinkedList
     LinkedList<String> ll = new LinkedList<String>();
     ll.add("Geeks");
     ll.add("Geeks");
     ll.add(1, "For");

     System.out.println(ll);
 }
}
