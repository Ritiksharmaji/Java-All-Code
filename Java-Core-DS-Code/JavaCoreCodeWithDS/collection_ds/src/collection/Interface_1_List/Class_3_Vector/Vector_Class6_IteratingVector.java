package collection.Interface_1_List.Class_3_Vector;
import java.io.*;
import java.util.*;
class Vector_Class6_IteratingVector {
 public static void main(String[] args)
 {
     Vector<String> v = new Vector<>();
     v.add("Geeks");
     v.add("Geeks");
     v.add(1, "For");
     for (int i = 0; i < v.size(); i++) {
         System.out.print(v.get(i) + " ");
     }
     System.out.println();

     for (String str : v)
         System.out.print(str + " ");
 }
}
