package collection.Interface_1_List.Class_4_Stack;
import java.util.*;
public class stack_class5_Removing_Elements {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);
        System.out.println("Initial Stack: " + stack);

        // Removing elements using pop() method
        System.out.println("Popped element: " + stack.pop());
                          
        System.out.println("Popped element: " + stack.pop());
           
        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stack);
                          
      
       System.out.println("Is stack empty? " + stack.empty()); // Should print false
       // Pop remaining elements
        stack.pop();
        stack.pop();
        stack.pop();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty()); // Should print true
    }
}
