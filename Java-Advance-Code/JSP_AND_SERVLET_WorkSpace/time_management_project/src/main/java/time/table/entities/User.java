package time.table.entities;


//import java.sql.Timestamp;

/*
* this is for login authentication dao
*/

public class User {

	
	private int id;
	private String type;
	private String password;
	private String name;

	
	private String profile;  // for storing the image
	
	
	
	// display the data
	public User( int id ,String name)
	{
		// 1 constructure
		
		this.id=id;
		this.name=name;	
		
	}
	public User()
	{
		// 2nd constuctre
	}
	
	
	// this is for data insert
	/*
	 * it going to initialize all the values of its parameters throw the RegisterServlet.
	 * it cleard RR...
	 */
	public User(String type , int id,String password)
	{
		// 3rd constructure
		this.type=type;
		this.id=id;
		this.password=password;
		/*
		 * so here what ever value we get from GUI that values will be stored here.
		 */
	}
	
	// getters and settters
	/*
	 * why we are using this setter and getter because what ever we are accessing 
	 * data from database which values will be store in respective variable by call this 
	 * method so that the comparison will be easy.
	 * 
	 * so when ever we will call this method then they goes to performs their operation
	 * but bassicallly we are going to call it by userDao for verification or for insert data.
	 */
	 public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	   

	   
	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	  
	    
	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	
	
}
