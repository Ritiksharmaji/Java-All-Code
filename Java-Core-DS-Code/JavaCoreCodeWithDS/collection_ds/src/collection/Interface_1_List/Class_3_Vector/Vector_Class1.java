package collection.Interface_1_List.Class_3_Vector;
import java.util.Vector;
public class Vector_Class1 
{
 public static void main(String[] args) 
 {
     Vector<Integer> v = new Vector<>(3, 2);
     v.addElement(1);
     v.addElement(2);
     v.addElement(3);

     // Insert an element at index 1
     v.insertElementAt(0, 1);

     // Remove the element at index 2
     v.removeElementAt(2);

     // Print the elements of the vector
     for (int i : v) {
         System.out.println(i);
     }
 }
}

