package javaOops._1classesAndObject;

public class Class3_Dog {
	 // Instance Variables
    String name;
    String breed;
    int age;
    String color;

    // Constructor Declaration of Class
    public Class3_Dog(String name, String breed, int age,
               String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1
    public String getName() { 
      return name; 
    }

    // method 2
    public String getBreed() { 
      return breed; 
    }

    // method 3
    public int getAge() { 
      return age; 
    }

    // method 4
    public String getColor() { 
      return color; 
    }

    @Override public String toString()
    {
        return ("Name is: " + this.getName()
                + "\nBreed, age, and color are: "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }

    public static void main(String[] args)
    {
    	Class3_Dog tuffy
            = new Class3_Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}
