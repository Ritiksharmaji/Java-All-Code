package collection.Interface_1_List.Class_2_LinkedList;
import java.util.LinkedList;
public class LinkedList_Class6_To_Array {
 public static void main(String[] args) {
     // Creating a LinkedList
	 LinkedList<Integer> list= new LinkedList<Integer>();
     list.add(123);
     list.add(12);
     list.add(11);
     list.add(1134);
     System.out.println("LinkedList: "+ list);
     Object[] a = list.toArray();
     System.out.print("After converted LinkedList to Array: ");
     for(Object element : a)
     System.out.print(element+" ");
 }
}
