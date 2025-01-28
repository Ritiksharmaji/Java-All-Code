package arrayPackage.MultiDimensional;

import java.util.Scanner;

public class _8_MultiArray_Runtime_Easy {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare a small 3D array
        int[][][] array3D = new int[2][2][2]; // 2 terms, 2 students, 2 subjects

        // Prompt user to fill the array
        System.out.println("Enter values for a 2x2x2 3D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print("Enter value for array[" + i + "][" + j + "][" + k + "]: ");
                    array3D[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Display the array
        System.out.println("\n3D Array Contents:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }

}
