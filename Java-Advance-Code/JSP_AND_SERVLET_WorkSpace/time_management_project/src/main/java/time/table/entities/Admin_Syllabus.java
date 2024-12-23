package time.table.entities;

public class Admin_Syllabus {
	
	private int id;
	private String name;
	private String operation;
	private String faculty_name;
	
	/*
	 * first constructor
	 */
	public Admin_Syllabus()
	{
		
	}
	
	/*
	 * second constructor
	 */
	public Admin_Syllabus(int id,String name,String operation)
	{
		this.id=id;
		this.name=name;
		this.operation=operation;
		
		
		
	}
	/*
	 * third constructor
	 */
	public Admin_Syllabus(int id,String name,String faculty_name,String s)
	{
		
		this.id=id;
		this.name=name;
		this.faculty_name=faculty_name;
	}

	/*
	 * getter and setter
	 */
	
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public String getName() {
			// TODO Auto-generated method stub
			return name;
		}


	  
	    public void setName(String name) {
	        this.name = name;
	    }

			

		public void setOperation(String operation) {
			// TODO Auto-generated method stub
		   this.operation=operation;
		}
		
		

		

		public String getOperation() {
			// TODO Auto-generated method stub
			return operation;
		}
	    
	    
	   

}

