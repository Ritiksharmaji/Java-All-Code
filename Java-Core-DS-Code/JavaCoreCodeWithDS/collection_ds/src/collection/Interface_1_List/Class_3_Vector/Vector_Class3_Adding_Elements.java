package collection.Interface_1_List.Class_3_Vector;
import java.io.*;
import java.util.*;
class Vector_Class3_Adding_Elements {
 public static void main(String[] args)
 {
	// Case 1 Creating a default vector
     Vector v1 = new Vector();
     // Adding custom elements using add() method
     v1.add(1);
     v1.add(2);
     v1.add("geeks");
     v1.add("forGeeks");
     v1.add(3);
     System.out.println("Vector v1 is " + v1);

     // Case 2 Creating generic vector
     Vector<Integer> v2 = new Vector<Integer>();
     v2.add(1);
     v2.add(2);
     v2.add(3);
     System.out.println("Vector v2 is " + v2);
 }
}
