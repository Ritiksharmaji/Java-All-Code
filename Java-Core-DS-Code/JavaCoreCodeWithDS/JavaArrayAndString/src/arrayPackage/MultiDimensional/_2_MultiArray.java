package arrayPackage.MultiDimensional;

public class _2_MultiArray {
	
	public static void main(String[] args){

        // Array Intialised and Assigned
      int[][] arr = { { 1, 2 }, { 3, 4 } };

        // Printing the Array
      for (int i = 0; i < 2; i++){
          for (int j = 0; j < 2; j++)
              System.out.print(arr[i][j]+" ");
            System.out.println();
      }
  }

}
