package Abstract_class;
class University
{
	int roll;
	String name;
	 static String college="vfstr";
	void student(int x,String y)
	{
		roll=x;
		name=y;
		//college="cbsc";
		System.out.println("name of student="+name+"roll number="+roll+"college="+college);
		
		
	}
	void teacher(int x,String y)
	{
		roll=x;
		name=y;
		System.out.println("name of student="+name+"roll number="+roll+"college="+college);
	}
}
class School
{
	int roll;
	String name;
	String college;
	void student_school(int x,String y)
	{
		roll=x;
		name=y;
		//college="cbsc";
		System.out.println("name of student="+name+"roll number="+roll+"college="+college);
		
		
	}
	
}

public class Static_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University obj=new University();
		obj.student(211, "RIITK");
		obj.teacher(1001, "nage radi");
		School obj1=new School();
		obj1.student_school(2001,"golu");
		
		

	}

}
