package Searching;

public class queuek_sork {
	public static int partition (int a[], int ib, int ub)  
	{  
	         int start,end,pivot,temp;
	     
	     pivot=a[ib];
	     start=ib;
	     end=ub;
	     
	while(start<end)
	{
	     while(a[start]<=pivot&&start<end)
	     {
	          start++;
	          
	     }
	     while(a[end]>pivot)
	     {
	          end--;
	     }
	     // for swapping
	     if(start<end)
	     {
	     temp=a[start];
	     a[start]=a[end];
	     a[end]=temp;
	     }
	}
	a[ib]=a[end];
	a[end]=pivot;
	return end;
	}  
	
	public  void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */  
	{  
	    if (start < end)  
	    {  
	        int p = partition(a, start, end);  //p is partitioning index  
	        quick(a, start, p - 1);  
	        quick(a, p + 1, end);  
	    }  
	}  
	  
	/* function to print an array */  
	void printArr(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
	    public static void main(String[] args) {  
	    int a[] = { 13, 18, 27, 2, 19, 25 };  
	    int n = a.length;  
	    System.out.println("\nBefore sorting array elements are - ");  
	    queuek_sork q1 = new queuek_sork();  
	    q1.printArr(a, n);  
	    q1.quick(a, 0, n - 1);  
	    System.out.println("\nAfter sorting array elements are - ");  
	    q1.printArr(a, n);  
	    System.out.println();  
	    }  
	 

}
