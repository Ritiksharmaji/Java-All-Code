package arrayPackage.finalArray;

public class FinalArray2 {
	
	int p = 20;

    // Main driver method
    public static void main(String args[])
    {

        // Creating objects of above class
        final FinalArray2 t1 = new FinalArray2();
        FinalArray2 t2 = new FinalArray2();

        // Assigning values into other objects
        t1 = t2;

        System.out.println(t1.p);
    }
}
