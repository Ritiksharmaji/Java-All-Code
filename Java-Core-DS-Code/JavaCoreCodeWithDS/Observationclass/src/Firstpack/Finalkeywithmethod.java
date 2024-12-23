package Firstpack;
 class  AA{
	 final void display()
	 {
		 System.out.println("this is parent class");
	 }
	 
	
}
 class BB extends AA{
	 void printing()
	 {
		 System.out.println("this is child class");
	 }
 }

public class Finalkeywithmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB obj=new BB();
		obj.display();
		obj.printing();

	}

}
