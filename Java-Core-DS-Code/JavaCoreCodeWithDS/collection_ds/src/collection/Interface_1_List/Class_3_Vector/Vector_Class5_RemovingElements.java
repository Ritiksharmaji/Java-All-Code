package collection.Interface_1_List.Class_3_Vector;
import java.io.*;
import java.util.*;
class Vector_Class5_RemovingElements {
 public static void main(String[] args)
 {
	 // Create default vector of capacity 10
     Vector v = new Vector();
     v.add(1);
     v.add(2);
     v.add("Geeks");
     v.add("forGeeks");
     v.add(4);

     // Removing first occurrence element at 1
     v.remove(1);

     // Checking vector
     System.out.println("after removal: " + v);
 }
}
