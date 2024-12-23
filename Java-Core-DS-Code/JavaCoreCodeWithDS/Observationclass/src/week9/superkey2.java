package week9;
class Person
{
int age=40;
int id=100;
 Person()
 {
 System.out.println("Person class Constructor");
 }
 void display()
 {
 System.out.println("super class person age="+age);
 } 
}
// subclass Student extending the Person class
class Student extends Person 
{
int age=20;
 Student()
 {
 super();
 System.out.println("Student class Constructor");
 }
 void show()
 {
 super.display();
 System.out.println("Person id="+super.id);
 System.out.println("Student age="+age);
 }
}

public class superkey2 {
	public static void main(String[] args)
	 {
	 Student c = new Student();
	 c.show();
	 }

}
