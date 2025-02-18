package collection.Interface_1_List.Class_4_Stack;

import java.util.Stack;

public class stack_class2 {
    public static void main(String[] args) {
        // Create a stack of strings
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");

        // Print the top element using peek() without removing it
        System.out.println("Top element using peek: " + stack.peek());

        // Pop elements from the stack (removes the top element)
        System.out.println("Popped: " + stack.pop());  // Removes "Date"
        System.out.println("Popped: " + stack.pop());  // Removes "Cherry"

        // Check if the stack is empty
        if (!stack.isEmpty()) {
            System.out.println("Top element after popping: " + stack.peek());  // Should print "Banana"
        }

        // Continue popping until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Check if the stack is empty at the end
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        }
    }
}
