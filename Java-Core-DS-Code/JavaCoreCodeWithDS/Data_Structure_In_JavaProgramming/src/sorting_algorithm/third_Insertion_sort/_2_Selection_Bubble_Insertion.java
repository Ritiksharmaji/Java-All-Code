package sorting_algorithm.third_Insertion_sort;
import java.util.Random;
public class _2_Selection_Bubble_Insertion {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i] = rand.nextInt(10000) + 1;
        }
      
          int[] temp = arr;

        long startTime = System.nanoTime();
        bubbleSort(arr.clone());
        long bubbleSortTime = System.nanoTime() - startTime;
      
          arr = temp;

        startTime = System.nanoTime();
        selectionSort(arr.clone());
        long selectionSortTime = System.nanoTime() - startTime;
      
          arr = temp;

        startTime = System.nanoTime();
        insertionSort(arr.clone());
        long insertionSortTime = System.nanoTime() - startTime;

        System.out.println("Bubble Sort time: " + bubbleSortTime);
        System.out.println("Selection Sort time: " + selectionSortTime);
        System.out.println("Insertion Sort time: " + insertionSortTime);
    }
}
