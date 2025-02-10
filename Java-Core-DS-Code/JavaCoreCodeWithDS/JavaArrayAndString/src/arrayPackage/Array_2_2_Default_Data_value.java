package arrayPackage;

//Java program to demonstrate default 
//values of array elements

class Array_2_2_Default_Data_value {
	public static void main(String[] args)
	{
		System.out.println("String array default values:");
		String str[] = new String[5];
		for (String s : str)
			System.out.print(s + " ");

		System.out.println(
			"\n\nInteger array default values:");
		int num[] = new int[5];
		for (int val : num)
			System.out.print(val + " ");

		System.out.println(
			"\n\nDouble array default values:");
		double dnum[] = new double[5];
		for (double val : dnum)
			System.out.print(val + " ");

		System.out.println(
			"\n\nBoolean array default values:");
		boolean bnum[] = new boolean[5];
		for (boolean val : bnum)
			System.out.print(val + " ");

		System.out.println(
			"\n\nReference Array default values:");
		Array_2_2_Default_Data_value ademo[] = new Array_2_2_Default_Data_value[5];
		for (Array_2_2_Default_Data_value val : ademo)
			System.out.print(val + " ");
	}
}
