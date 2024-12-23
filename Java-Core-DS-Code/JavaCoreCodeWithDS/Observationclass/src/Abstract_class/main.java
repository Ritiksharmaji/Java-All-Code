 package Abstract_class;
abstract class media 
{
	int id;
	String description;
	media(int id,String description)
	{
		this.id = id;
		this.description = description;
	}
	abstract void display();
}
class Book1 extends media 
{
    int pageCount;
	Book1(int pageCount)
	{
		super(1,"Vishnu");
		this.pageCount = pageCount;
	}
	public void display()
	{
		System.out.println("Media Id = " + this.id);
		System.out.println("Media Description = " + this.description);
	}
	public void show()
	{
	    System.out.println("Page Count = " + this.pageCount);
	}
}
class CD extends media
{
    float playTime;
    CD(float playTime)
    {
	  super(2,"Aravind");
        this.playTime = playTime;
    }
	public void display()
	{
		System.out.println("Media Id = " + this.id);
		System.out.println("Media Description = " + this.description);
	}
    void show()
    {
        System.out.println("Play Time = " + this.playTime);
    }
}

public class main {public static void main(String args[])
{
	Book1 obj1 = new Book1(20);
	obj1.display();
	obj1.show();
	CD obj2 = new CD(10);
	obj2.show();
	obj2.display();
}
}
