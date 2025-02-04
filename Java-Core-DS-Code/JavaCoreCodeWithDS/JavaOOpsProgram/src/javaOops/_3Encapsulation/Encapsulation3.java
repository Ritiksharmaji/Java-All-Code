package javaOops._3Encapsulation;

class Employee {
    private final String empId; // Final variable (cannot be changed)

    // Constructor (Only way to set empId)
    public Employee(String empId) {
        this.empId = empId;
    }

    // Getter method (Read-Only)
    public String getEmpId() {
        return empId;
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Employee emp = new Employee("E12345");
        System.out.println("Employee ID: " + emp.getEmpId());

        // emp.empId = "E67890"; ❌ ERROR: Cannot modify final variable
    }
}
