package collection.Interface_1_List;

import java.util.*;

class List_2_adding {
    public static void main(String[] args) {
        // The above with array
        String[] str = new String[8];

        // Method 1: Direct Assignment
        str[0] = "Apple";
        str[1] = "Banana";
        str[2] = "Cherry";

        // Method 2: Assigning using a loop
        String[] values = {"Mango", "Grapes", "Orange"};

        int j = 3; // Start from index 3
        for (int i = 0; i < values.length; i++) {
            str[j] = values[i];
            j++;
        }

        // Printing the array
        System.out.println("Array elements: " + Arrays.toString(str));

        // Using the List Interface
        List<String> al = new ArrayList<>();

        al.add("Ritik Sharma");
        al.add("Ushri Khurd");
        al.add(1, "BCA");

        System.out.println("List elements: " + al);
    }
}
