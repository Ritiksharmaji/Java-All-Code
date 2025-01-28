package arrayPackage.finalArray;

public class FinalArray1 {
	
	 public static void main(String[] args)
	    {

	        final int[] arr = { 1, 2, 3, 4, 5 };

	        arr[4] = 1;

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        
	        // Iterating over integer array
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = arr[i] * 10;
	            System.out.println(arr[i]);
	        }
	    }

}
