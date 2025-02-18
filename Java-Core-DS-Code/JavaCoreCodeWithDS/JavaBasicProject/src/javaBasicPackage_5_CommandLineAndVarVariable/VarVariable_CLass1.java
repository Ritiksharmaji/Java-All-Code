package javaBasicPackage_5_CommandLineAndVarVariable;

public class VarVariable_CLass1 {

	static void printDetails(String name, int... marks) {
        System.out.println("Student: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		 printDetails("Alice", 85, 90, 95);
	        printDetails("Bob"); // No marks provided	

	}

}
