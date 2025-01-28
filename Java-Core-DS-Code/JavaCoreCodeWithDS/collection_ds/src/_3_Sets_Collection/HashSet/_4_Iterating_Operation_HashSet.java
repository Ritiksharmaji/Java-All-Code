package _3_Sets_Collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _4_Iterating_Operation_HashSet {

	public static void main(String[] args) {
		// Create a HashSet of Strings
        HashSet<String> hs = new HashSet<>();

        // Add elements to the HashSet
        hs.add("A");
        hs.add("B");
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Z");

        // Using iterator() method to iterate
          // Over the HashSet
        System.out.print("Using iterator : ");
        Iterator<String> iterator = hs.iterator();
      
          // Traversing HashSet
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");

        System.out.println();

        // Using enhanced for loop to iterate
          // Over the HashSet
        System.out.print("Using enhanced for loop : ");
        for (String element : hs)
            System.out.print(element + " , ");
	}

}
