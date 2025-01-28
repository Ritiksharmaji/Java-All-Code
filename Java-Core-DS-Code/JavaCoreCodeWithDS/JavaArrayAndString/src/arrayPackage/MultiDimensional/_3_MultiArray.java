package arrayPackage.MultiDimensional;

public class _3_MultiArray {

	public static void main(String[] args) {
	      
        // Row and Columns in Array
      int n = 2;
      int m = 2;

        // Array declared and initialized
      int[][] arr = new int[n][m];

      int it = 1;
    
        // Assigning the values to array
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              arr[i][j] = it;
              it++;
          }
      }

        // Printing the Array
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++)
              System.out.print(arr[i][j] + " ");
          System.out.println();
      }
  }
}
