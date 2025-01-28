package arrayPackage.MultiDimensional;

import java.util.Scanner;

public class _8_MultiArray_Runtime_Complex {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get dimensions of the 3D array from the user
	        System.out.println("Enter the number of terms: ");
	        int terms = scanner.nextInt();
	        System.out.println("Enter the number of students per term: ");
	        int students = scanner.nextInt();
	        System.out.println("Enter the number of subjects: ");
	        int subjects = scanner.nextInt();

	        // Create a 3D array based on user input
	        int[][][] scores = new int[terms][students][subjects];

	        // Fill the array with user input
	        System.out.println("\nEnter the scores:");
	        for (int t = 0; t < terms; t++) {
	            for (int s = 0; s < students; s++) {
	                for (int sub = 0; sub < subjects; sub++) {
	                    System.out.print("Enter score for Term " + (t + 1) + ", Student " + (s + 1) + ", Subject " + (sub + 1) + ": ");
	                    scores[t][s][sub] = scanner.nextInt();
	                }
	            }
	        }

	        // Display the scores
	        System.out.println("\nScores:");
	        for (int t = 0; t < terms; t++) {
	            System.out.println("Term " + (t + 1) + ":");
	            for (int s = 0; s < students; s++) {
	                System.out.print("  Student " + (s + 1) + ": ");
	                for (int sub = 0; sub < subjects; sub++) {
	                    System.out.print(scores[t][s][sub] + " ");
	                }
	                System.out.println();
	            }
	        }

	        // Calculate the average score for each student across terms
	        for (int s = 0; s < students; s++) {
	            int total = 0;
	            int count = 0;
	            for (int t = 0; t < terms; t++) {
	                for (int sub = 0; sub < subjects; sub++) {
	                    total += scores[t][s][sub];
	                    count++;
	                }
	            }
	            double average = total / (double) count;
	            System.out.println("Average score for Student " + (s + 1) + ": " + average);
	        }

	        scanner.close();
	 }
}
