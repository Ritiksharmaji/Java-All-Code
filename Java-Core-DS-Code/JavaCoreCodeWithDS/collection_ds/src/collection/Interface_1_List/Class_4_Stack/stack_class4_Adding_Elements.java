package collection.Interface_1_List.Class_4_Stack;
import java.util.*;
import java.io.*;
public class stack_class4_Adding_Elements {
 public static void main(String args[])
 {
     Stack<String> stack = new Stack<String>();
     stack.push("Welcome");
     stack.push("To");
     stack.push("Geeks");
     stack.push("For");
     stack.push("Geeks");

     // Displaying the Stack
     System.out.println("Initial Stack: " + stack);

     // Fetching the element at the head of the Stack
     System.out.println("The element at the top of the"
                        + " stack is: " + stack.peek());

     // Displaying the Stack after the Operation
     System.out.println("Final Stack: " + stack);
 }
}
