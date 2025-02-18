package sorting_algorithm.second_Bubble_sort;

public class _1_bubble_sort {

	static void bubbleSort(int arr[], int length) {
		int temp;
		boolean swapped = false;
		for(int i = 0; i< length-1; i++) {
			
			for(int j = 0; j < length-i -1 ; j++) {
				
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[i] = temp;
					swapped = true;
				}
				
				if( ! swapped) {
					break;
					
				}
			}
			
		}
		
	}
	
	
	static void printArray(int arr[], int lenght) {
		
		int i =0;
		for( i =0; i< lenght; i++) {
			
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	// Driver program
    public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

}
