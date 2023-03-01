package methods;

public class Reverseofarray_6 {
	
	static int [] array(int a[]) 
	{
		int b[]=new int[10];
		int i,j;
		for(i=a.length-1,j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
		}
		
		return b;
	}
	
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6};
		int c[]=new int[10];
		c=array(a);
		System.out.println("Reverse of an array is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(c[i]);
		}
		
	}

}
