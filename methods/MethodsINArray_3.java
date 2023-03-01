package methods;

public class MethodsINArray_3 {
	static void change(int A[],int index,int num)
	{
		A[index]=num;
		int i;
		System.out.println("Output IN SIDE METHOD");
		for(i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		
	}
	public static void main(String arg[])
	{
		int A[]= {1,2,3,4,5,6};
		int i;
		change(A,2,100);
		System.out.println("OUTPUT IN SIDE PSVM");
		for(i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}

}
