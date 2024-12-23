package String;

public class String_format {
	public static void main(String args[]){  
		int i=200;  
		String s=String.format("%d",i);  
		System.out.println(s); 
		//System.out.println(s+"types of data="+((object)s).getclass().getSimpleName());
		System.out.println("before conver"+i+ " is of type " + ((Object)i).getClass().getSimpleName());
		System.out.println("after conver"+s+ " is of type " + ((Object)s).getClass().getSimpleName());
		} 

}
