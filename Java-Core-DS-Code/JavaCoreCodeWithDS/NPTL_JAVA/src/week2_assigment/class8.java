package week2_assigment;

public class class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {0,1,2};
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[(a[i]+3)%a.length];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}

	}

}
