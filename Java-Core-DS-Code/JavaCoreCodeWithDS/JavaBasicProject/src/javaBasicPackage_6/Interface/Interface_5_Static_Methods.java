package javaBasicPackage_6.Interface;

interface TestInterface2
{
    final int a = 10;
    static void display()
    {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class Interface_5_Static_Methods implements TestInterface
{
    // Driver Code
    public static void main (String[] args)
    {
    	TestInterface2.display();
    }
}
