package collection.Interface_1_List.Class_2_LinkedList;
import java.util.LinkedList;
public class LinkedList_Class2 {
 public static void main(String[] args) {
     // Creating a LinkedList
     LinkedList<String> ll = new LinkedList<String>();
  // Adding elements to the linked list
     ll.add("A");
     ll.add("B");
     ll.addLast("C");
     ll.addFirst("D");
     ll.add(2, "E");

     System.out.println(ll);

     ll.remove("B");
     ll.remove(3);
     ll.removeFirst();
     ll.removeLast();

     System.out.println(ll);
 }
}
