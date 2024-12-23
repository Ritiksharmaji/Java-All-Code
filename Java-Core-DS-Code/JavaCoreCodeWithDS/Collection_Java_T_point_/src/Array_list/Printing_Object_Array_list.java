package Array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class person{
	String id;
	String name;
	int age;
	String course;
	
	public person(String id,String name,int age , String course)
	{
		this.age=age;
		this.course=course;
		this.id = id;
		this.name = name;
		
	}
}

public class Printing_Object_Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person object = new person("211fj01050","Ritik sharma",22,"BCA");
		person object2 = new person("211fj01020","Ankit sharma",27,"MBA");
		person object3 = new person("211fj01010","Abhi varma",23,"BCA");
		
		List<person> list=new ArrayList<person>();
		list.add(object);
		list.add(object2);
		list.add(object3);
		
		System.out.println(list); 
		/*
		 * output for above is 
		 * [Array_list.person@52cc8049, Array_list.person@5b6f7412, Array_list.person@27973e9b]
		 */
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			/*
			 * System.out.print(it.next()+" ");
			 * output-
			 * Array_list.person@52cc8049 Array_list.person@5b6f7412 Array_list.person@27973e9b
			 * so 
			 */
			    person st=(person)it.next();  
			    System.out.println(st.id+" "+st.name+" "+st.age);  
			
		}
		

	}

}
