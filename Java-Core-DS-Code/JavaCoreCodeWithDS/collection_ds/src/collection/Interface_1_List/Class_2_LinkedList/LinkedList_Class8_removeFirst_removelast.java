package collection.Interface_1_List.Class_2_LinkedList;
import java.util.LinkedList;
public class LinkedList_Class8_removeFirst_removelast {
 public static void main(String[] args) {
     // Creating a LinkedList
	 LinkedList<Integer> list = new LinkedList<Integer>();
     list.add(10);
     list.add(20);
     list.add(30);
     System.out.println("LinkedList:" + list);
     System.out.println("The  remove first element is: " + list.removeFirst());
     // Displaying the final list
     System.out.println("Final LinkedList:" + list);
     System.out.println("The last element is removed: " + list.removeLast());
     System.out.println("Final LinkedList:" + list);
     
     
 }
}
