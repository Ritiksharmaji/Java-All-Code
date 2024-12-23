package time.table.entities;

public class Admin_Course {
	private String id;
	private int year;
	private String name;
	private String operation;
	private String faculty_name;
	
	/*
	 * first constructor
	 */
	public Admin_Course()
	{
		
	}
	
	/*
	 * second constructor
	 */
	public Admin_Course(String id,String name,int year,String operation)
	{
		this.id=id;
		this.year=year;
		this.name=name;
		this.operation=operation;
		
		
		
	}
	/*
	 * third constructor
	 */
	public Admin_Course(String id,int year,String name,String faculty_name,String s)
	{
		this.id=id;		
		this.year=year;
		this.name=name;
		this.faculty_name=faculty_name;
	}

	/*
	 * getter and setter
	 */
	
	    public void setId(String id) {
	        this.id= id;
	    }
	    	    
	    
	    public void setYear(int year) {
	        this.year = year;
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
		public String getId() {
			// TODO Auto-generated method stub
			return id;
		}
		 public int getYear() {
				// TODO Auto-generated method stub
				return year;
			} 
		 public String getName() {
				// TODO Auto-generated method stub
				return name;
			}


		

}
