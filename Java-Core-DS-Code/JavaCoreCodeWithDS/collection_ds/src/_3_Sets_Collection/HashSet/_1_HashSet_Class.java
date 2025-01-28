package _3_Sets_Collection.HashSet;

import java.util.HashSet;

public class _1_HashSet_Class {
	
	 public static void main(String[] args) 
	    {
	        // Instantiate an object of HashSet
	        HashSet<Integer> hs = new HashSet<>();

	          // Adding elements 
	        hs.add(1);
	        hs.add(2);
	        hs.add(1);

	        // Printing the Size and Element of HashSet
	        System.out.println("HashSet Size: " + hs.size());
	        System.out.println("Elements in HashSet: " + hs);
	    }

}
