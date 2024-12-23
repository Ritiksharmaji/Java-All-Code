package WEEK1;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		a=a+6;
		
		switch(a-1)
		{
		case 5:System.out.println("10");
		       break;
		case 10:
			System.out.print("15");
			System.out.print(((a%2==0)?"-even-":"-odd-"));
		default:
			System.out.print(a%2);
		}

	}

}
