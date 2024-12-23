package week3_video_program;

public class class2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		char choice;
		do {
			
			System.out.println("hello on");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. while");
			System.out.println("4. do-while");
			System.out.println("5.for");
			System.out.println("choice one");
			choice=(char)System.in.read();
		}while(choice<'1'||choice>'5');
		
		System.out.println("\n");
		
		switch(choice)
		{
		case '1':
			System.out.println("the if:\n");
			System.out.println("if (condition) statement:");
			System.out.println("else statement:");
			break;
		case '2':
			System.out.println("the switch:\n");
			System.out.println("switch(expression)");
			System.out.println("hello on");
			System.out.println("hello on");
			
			
		}
		
		

	}

}
