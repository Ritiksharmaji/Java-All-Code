package arrayPackage;

public class Array_3_Implementation_nonPrimitive_Type {
    
    class Student { // Non-static inner class
        public int roll_no;
        public String name;
      
        Student(int roll_no, String name){
            this.roll_no = roll_no;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the enclosing class
        Array_3_Implementation_nonPrimitive_Type instance = new Array_3_Implementation_nonPrimitive_Type();

        // Declares an Array of Student
        Student[] arr;

        // Allocating memory for 5 objects of type Student
        arr = new Student[5];

        // Initialize the elements of the array
        arr[0] = instance.new Student(1, "aman");
        arr[1] = instance.new Student(2, "vaibhav");
        arr[2] = instance.new Student(3, "shikar");
        arr[3] = instance.new Student(4, "dharmesh");
        arr[4] = instance.new Student(5, "mohit");

        // Accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : { "
                               + arr[i].roll_no + " "
                               + arr[i].name + " }");
        }
    }
}
