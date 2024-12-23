package Array;

import java.util.Scanner;

/*
 * Random number generate.
 */
public class Class_1 {
	
	 static int Max =100,Min=1;
	static int size;
	static int a[] = new int[1000];
	
	public static int GenerateRandom(int max ,int min)
	{
		int rand = (int) (Math.random()*(max - min))+1 + min;
		System.out.println("Random:"+Math.random()*100);
		
		return rand;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of array:");
		size = sc.nextInt();
		for(int i =0; i< size ; i++)
		{
			a[i] =GenerateRandom(Max , Min);
		}
		System.out.println("capacity:"+a.length+"size:"+size);
		System.out.println("array:"+a);
		System.out.println("printing array");
		for(int aa:a)
		{
			System.out.println(aa);
		}
		System.out.println(a.length);

	}

}
