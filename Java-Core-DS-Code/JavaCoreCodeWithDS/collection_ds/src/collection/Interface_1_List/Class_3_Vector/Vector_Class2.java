package collection.Interface_1_List.Class_3_Vector;
import java.io.*;
import java.util.*;
class Vector_Class2 {
 public static void main(String[] args)
 {
     // Size of the Vector
     int n = 5;
     Vector<Integer> v = new Vector<Integer>(n);
     for (int i = 1; i <= n; i++)
         v.add(i);
     System.out.println(v);
     v.remove(3);
     System.out.println(v);
     for (int i = 0; i < v.size(); i++)
         System.out.print(v.get(i) + " ");
 }
}
