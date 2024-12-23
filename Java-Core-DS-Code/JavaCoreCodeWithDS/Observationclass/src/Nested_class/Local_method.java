package Nested_class;
public class Local_method {

	 private int data=30;//instance variable  
	 void display(){  
	  int value=50;//local variable must be final till jdk 1.7 only  
	  class Local{  
	   void msg(){System.out.println(value);}  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 public static void main(String args[]){  
	  Local_method obj=new Local_method();  
	  obj.display();  
	 }  
	}  

