package unit_2_package;

class Operation
{  
     int data=50;  
     void change(int data)
    {  
        data=data+100;  
      //this.data=data+100; it will works as call by referance.
      //  System.out.println("value of data="+data); it will be change
        
     }   
 }  



public class call_by_values1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	       Operation op=new Operation();  
	       System.out.println("before change "+op.data);  
	       op.change(500);  
	       System.out.println("after change "+op.data);  // not change
	       // beacuse main thread is exeuted it that why 
	      
	}

}
