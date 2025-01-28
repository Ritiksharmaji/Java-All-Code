package arrayPackage.MultiDimensional;

public class _6_MultiArrayThree {
	
	public static void main(String[] args) {
        // Declare and initialize a 3D array
        int[][][] array3D = {
            {
                {1, 2, 3}, 
                {4, 5, 6}
            },
            {
                {7, 8, 9}, 
                {10, 11, 12}
            },
            {
                {13, 14, 15}, 
                {16, 17, 18}
            }
        };

        // Accessing elements in the 3D array
        System.out.println("Element at [0][1][2]: " + array3D[0][1][2]); // Output: 6
        System.out.println("Element at [2][0][1]: " + array3D[2][0][1]); // Output: 14

        // Iterating through the 3D array
        System.out.println("\nAll elements in the 3D array:");
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
