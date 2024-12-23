package time.table.entities;

public class Admin_Faculty {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String dob;
	private String operation;
		
	
	/*
	 * first constructor
	 */
	public Admin_Faculty()
	{
		
	}
	
	/*
	 * second constructor
	 * to store the data into database means to transfer the data to Faculty_Dao object.
	 */
	public Admin_Faculty(int id,String name,String email,String password,String gender, String dob,String operation)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=password;
		this.gender=gender;
		this.dob=dob;
		this.operation=operation;
		
		
		
	}
	/*
	 * third constructor
	 * for display the data
	 */
	public Admin_Faculty(int id,String name,String email,String password)
	{
		this.id=id;		
		this.email=email;
		this.name=name;
		this.password=password;
	}

	/*
	 * getter and setter
	 */
	/*
	 * setter
	 */
	    public void setId(int id) {
	        this.id= id;
	    }
	     
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	    
	    public void setDate_join(String dob) {
	        this.dob = dob;
	    }

			

		public void setOperation(String operation) {
			// TODO Auto-generated method stub
		   this.operation=operation;
		}
	

		/*
		 * getter
		 */
		
		public String getOperation() {
			// TODO Auto-generated method stub
			return operation;
		}
		public int getId() {
			// TODO Auto-generated method stub
			return id;
		}
		
		 public String getName() {
				// TODO Auto-generated method stub
				return name;
			}
		 public String getEmail() {
				// TODO Auto-generated method stub
				return email;
			}
		 public String getPassword() {
				// TODO Auto-generated method stub
				return password;
			}
		 public String getGender() {
				// TODO Auto-generated method stub
				return gender;
			}
		 public String getDate_join() {
				// TODO Auto-generated method stub
				return dob;
			}

}
