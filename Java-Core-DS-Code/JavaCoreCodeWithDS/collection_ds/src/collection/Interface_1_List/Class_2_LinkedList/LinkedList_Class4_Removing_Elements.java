package collection.Interface_1_List.Class_2_LinkedList;
import java.util.LinkedList;
public class LinkedList_Class4_Removing_Elements {
 public static void main(String[] args) {
     // Creating a LinkedList
     LinkedList<String> ll = new LinkedList<String>();
     ll.add("Geeks");
     ll.add("Geeks");
     ll.add(1, "For");
     System.out.println("Initial LinkedList " + ll);
       // Function call
     ll.remove(1);

     System.out.println("After the Index Removal " + ll);

     ll.remove("Geeks");

     System.out.println("After the Object Removal "
                        + ll);
 }
}
