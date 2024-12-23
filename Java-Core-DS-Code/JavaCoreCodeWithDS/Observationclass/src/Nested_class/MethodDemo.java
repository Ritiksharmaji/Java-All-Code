package Nested_class;
class Outer {
	void outerMethod() {
		System.out.println("inside outer Method");
		// Inner class is local to outer Method()
		class Inner {
			void innerMethod() {
			System.out.println("inside inner Method");
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
}
class MethodDemo {
	public static void main(String[] args) {
		Outer x = new Outer();
		x.outerMethod();
	}
}


/*
public class MethodDemo {

}
*/