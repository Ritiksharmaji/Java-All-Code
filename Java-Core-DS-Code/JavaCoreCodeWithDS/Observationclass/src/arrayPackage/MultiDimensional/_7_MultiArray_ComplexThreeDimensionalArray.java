package arrayPackage.MultiDimensional;

public class _7_MultiArray_ComplexThreeDimensionalArray {
	
	 public static void main(String[] args) {
	        // A 3D array to store scores
	        // Dimensions: [terms][students][subjects]
	        int[][][] scores = {
	            { // Term 1
	                {85, 90, 78}, // Student 1: Math, Science, English
	                {88, 76, 95}, // Student 2: Math, Science, English
	                {92, 88, 81}  // Student 3: Math, Science, English
	            },
	            { // Term 2
	                {80, 85, 88}, // Student 1: Math, Science, English
	                {89, 90, 92}, // Student 2: Math, Science, English
	                {91, 82, 84}  // Student 3: Math, Science, English
	            },
	            { // Term 3
	                {87, 88, 90}, // Student 1: Math, Science, English
	                {85, 91, 89}, // Student 2: Math, Science, English
	                {93, 94, 96}  // Student 3: Math, Science, English
	            }
	        };

	        // Accessing specific scores
	        System.out.println("Student 2's Science score in Term 1: " + scores[0][1][1]); // Output: 76
	        System.out.println("Student 3's English score in Term 3: " + scores[2][2][2]); // Output: 96

	        // Calculating the average score for Student 1 across all terms in Math (Subject 0)
	        int totalMathScore = 0;
	        for (int term = 0; term < scores.length; term++) {
	            totalMathScore += scores[term][0][0];
	        }
	        double averageMathScore = totalMathScore / (double) scores.length;
	        System.out.println("Average Math score for Student 1: " + averageMathScore); // Output: 84.0

	        // Display all scores for each student in each term
	        System.out.println("\nAll scores:");
	        for (int term = 0; term < scores.length; term++) {
	            System.out.println("Term " + (term + 1) + ":");
	            for (int student = 0; student < scores[term].length; student++) {
	                System.out.print("  Student " + (student + 1) + ": ");
	                for (int subject = 0; subject < scores[term][student].length; subject++) {
	                    System.out.print(scores[term][student][subject] + " ");
	                }
	                System.out.println();
	            }
	        }
	    }

}
