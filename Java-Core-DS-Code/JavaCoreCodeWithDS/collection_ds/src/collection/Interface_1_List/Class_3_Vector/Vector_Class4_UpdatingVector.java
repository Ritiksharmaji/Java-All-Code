package collection.Interface_1_List.Class_3_Vector;
import java.io.*;
import java.util.*;
class Vector_Class4_UpdatingVector {
 public static void main(String[] args)
 {
     Vector<Integer> vec_tor = new Vector<Integer>();  
     vec_tor.add(12); 
     vec_tor.add(23); 
     vec_tor.add(22); 
     vec_tor.add(10); 
     vec_tor.add(20); 
     System.out.println("Vector: " + vec_tor); 
     // Using set() method to replace 12 with 21 
     System.out.println("The Object that is replaced is: "
                     + vec_tor.set(0, 21)); 
     // Using set() method to replace 20 with 50 
     System.out.println("The Object that is replaced is: "
                     + vec_tor.set(4, 50)); 
     // Displaying the modified vector 
     System.out.println("The new Vector is:" + vec_tor); 
 }
}
