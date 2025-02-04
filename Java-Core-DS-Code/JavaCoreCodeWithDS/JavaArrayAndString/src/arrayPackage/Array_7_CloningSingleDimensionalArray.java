package arrayPackage;

public class Array_7_CloningSingleDimensionalArray {
	
	public static void main(String args[])
    {
        int intArray[] = { 1, 2, 3 };

        int cloneArray[] = intArray.clone();

        // will print false as shallow copy is created
        System.out.println(intArray == cloneArray);
        
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }

}
