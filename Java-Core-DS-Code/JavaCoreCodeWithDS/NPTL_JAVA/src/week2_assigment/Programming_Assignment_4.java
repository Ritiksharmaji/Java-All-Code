package week2_assigment;
class Answer{
	
	public void Answer()
	{
		System.out.println("You got nothing.");
	}
	public void Answer(int marks,String type)
	{
		this();
		System.out.println("You got "+marks+" for an "+ type);
		
	}
}
public class Programming_Assignment_4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Answer a = new Answer(20,"boy");

	}

}
