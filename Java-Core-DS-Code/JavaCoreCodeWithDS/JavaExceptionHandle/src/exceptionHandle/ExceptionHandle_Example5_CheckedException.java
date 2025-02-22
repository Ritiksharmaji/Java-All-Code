package exceptionHandle;

import java.io.*;

class ExceptionHandle_Example5_CheckedException {
    public static void main(String[] args) {
        try {
            // Reading file from path in local directory
            FileReader f = new FileReader("D:\\test\\aa.txt");

            // Creating object as one of ways of taking input
            BufferedReader b = new BufferedReader(f);

            // Printing first 3 lines of the file
            for (int counter = 0; counter < 3; counter++) {
                String line = b.readLine(); // Use BufferedReader to read lines
                if (line != null) {
                    System.out.println(line);
                } else {
                    break; // Exit loop if file has fewer than 3 lines
                }
            }

            // Closing file connections
            b.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
