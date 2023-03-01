package methods;

public class METHODOVERLOADINGlargestof2and3_5 {
	
	static int largest(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	static int largest(int x,int y,int z)
	{
		if(x>y&&x>z)
		{
			return x;
		}
		else if(y>x&&y>z)
		{
			return y;
		}
		else
		{
			return z;
		}
	}
	
	public static void main(String arg[])
	{
		int c;
		c=largest(5,3);
		System.out.println(c);
		c=largest(1,2,3);
		System.out.println(c);
	}

}
