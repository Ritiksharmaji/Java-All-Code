package interface_program;
interface manam
{
    public static double pi = 3.141592; 
    public void area();
    public void volume();
}
class Cylinder implements manam
{
    int height;
    double radius;
    Cylinder(int height, double radius)
    {
        this.height = height;
        this.radius = radius;
    }
    public void area()
    {
        System.out.println("Area of the Cylinder = " + ((2 * pi * this.radius * this.height) + (2 * pi * (this.radius * this.radius))));
    }
    public void volume()
    {
        System.out.println("Volume of the Cylinder = " + (pi * (this.radius * this.radius) * this.height));
    }
}
class Main 
{
    public static void main(String[]args)
    {
        Cylinder obj = new Cylinder(10 , 5);
        obj.volume();
        obj.area();
    }
}

