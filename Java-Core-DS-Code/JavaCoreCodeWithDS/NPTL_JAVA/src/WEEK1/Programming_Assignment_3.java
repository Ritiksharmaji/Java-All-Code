package WEEK1;
//to find the perimeter and area of a circle given a value of radius.
import java.util.*;
public class Programming_Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter radius ");
	       double radius= s.nextDouble();
	       double perimeter;
	       double area;
		/*
		//Calculate the perimeter 
		 area = 2 * Math.PI * radius;
		//Calculate the area
			perimeter = area * radius;
			
			
			System.out.println(area);
		System.out.println(perimeter);  */
		 perimeter = 2 * Math.PI * radius;
		   area = Math.PI * radius * radius;
			
			System.out.println(perimeter);
			System.out.print(area);
		
		

	}

}
