package interface_program;
 interface person{
	 public void show();
	
}
 interface human{
	 public void display();
 }

public class multiple_inharitance implements person,human{
	public void show()
	{
		System.out.println("i am show one");
	}
	public void display()
	{
		 System.out.println("i am display");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiple_inharitance obj=new multiple_inharitance();
		obj.display();
		obj.show();

	}

}
