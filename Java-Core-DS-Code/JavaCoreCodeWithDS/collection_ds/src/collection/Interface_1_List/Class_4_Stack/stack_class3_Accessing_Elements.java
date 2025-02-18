package collection.Interface_1_List.Class_4_Stack;
import java.util.*;
class stack_class3_Accessing_Elements {
 public static void main(String[] args)
 {
     // Default initialization of Stack
     Stack stack1 = new Stack();

     // Initialization of Stack using Generics
     Stack<String> stack2 = new Stack<String>();

     stack1.push("4");
     stack1.push("All");
     stack1.push("Geeks");

     stack2.push("Geeks");
     stack2.push("For");
     stack2.push("Geeks");

       // Printing the Stack Elements
     System.out.println(stack1);
     System.out.println(stack2);
 }
}
