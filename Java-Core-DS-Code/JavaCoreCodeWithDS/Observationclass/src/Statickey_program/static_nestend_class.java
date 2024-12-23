package Statickey_program;
class person{
	int a=10;
	static class boy{
	//	private void Syso() {
			// TODO Auto-generated method stub
		public static  void show() {
		System.out.println("this is inner ckass");

		}
	}
}

public class static_nestend_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//person.boy.show(); this is showing erre;
	//	person.boy obj=new person.boy();
		
	//	obj.show();
		person.boy.show();
	


	}

}
