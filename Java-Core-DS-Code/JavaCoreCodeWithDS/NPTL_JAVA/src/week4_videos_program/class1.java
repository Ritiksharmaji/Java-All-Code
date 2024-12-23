/**
 * 
 */
package week4_videos_program;

/**
 * @author RITIK SHARMA
 *
 */
class A
{
	protected int roll_no=550;
	protected void msg()
	{
		System.out.println("class A:hello java");
	}
}
public class class1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		//obj.roll_no;
		obj.msg();
		// so protected members are not able to access 
		// but protected method is able to access.

	}

}
