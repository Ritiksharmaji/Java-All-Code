package collection.Interface_1_List.Class_4_Stack;

import java.util.Stack; // Correct import

public class Stack_CLass1 {
    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> s = new Stack<>();

        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // Pop elements from the stack
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
