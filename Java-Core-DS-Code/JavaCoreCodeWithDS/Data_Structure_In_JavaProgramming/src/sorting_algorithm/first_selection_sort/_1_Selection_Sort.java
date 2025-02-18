package sorting_algorithm.first_selection_sort;

public class _1_Selection_Sort {
	static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
          
            // Assume the current position holds the minimum element           
            int min_idx = i;

            // Iterate through the unsorted portion to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                  
                    // Update min_idx if a smaller element is found
                    min_idx = j;
                }
            }

            // Move minimum element to its correct position by using swap 
            int temp = arr[i];         // Step 1: Store the value of arr[i] in a temporary variable
            arr[i] = arr[min_idx];     // Step 2: Assign the value of arr[min_idx] to arr[i]
            arr[min_idx] = temp;       // Step 3: Assign the value stored in 'temp' to arr[min_idx]
      
        }
    }
	
	static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
  
    public static void main(String[] args){
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }

}
