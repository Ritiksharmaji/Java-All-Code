package unit_2_package;
class Rectangle 
{ 
        int length; 
        int breadth; 
        //constructor to initialize length and bredth of rectang of rectangle 
        Rectangle(int l, int b) 
        {   
           length = l; 
           breadth= b;
           
        } 
        //copy constructor 
        Rectangle(Rectangle obj) 
        { 
          System.out.println("Copy Constructor Invoked"); 
          length = obj.length; 
          breadth= obj.breadth; 
        }
        int area() 
        { 
           return (length * breadth); 
           
        } 
 } 



public class copy_constuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle firstRect = new Rectangle(5,6); 
        Rectangle secondRect= new Rectangle(firstRect); 
        System.out.println("Area  of First Rectangle : "+ firstRect.area()); 
        System .out.println("Area of First Second Rectangle : "+ secondRect.area()); 


	}

}
