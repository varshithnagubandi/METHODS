package methods;

public class SumofnumbersbyMETHODOVERLOADING {
	
	static void sum(float x,int y)
	{
		float z=x+y;
		System.out.println("OUTPUT FOR METHOD 1 :");
		
		System.out.println(z);
	}
	
	static float sum(float x,int y,int z)
	{
		float w=x+y+z;
		System.out.println("OUTPUT FOR METHOD 2 :");
		return w;
	}
	
	public static void main(String arg[])
	{
		int b=10,c=20;
		float a=1.25f,d;
		sum(a,b);
		d=sum(a,b,c);
		System.out.println(d);
		
	}

}
