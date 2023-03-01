package methods;

public class Methodvariationinandoutofmethod_2 {
	static void inhert(int a)
	{
		a++;
		System.out.println("Value of a inside method"+a);
	}
	public static void main(String arg[])
	{
		int a=100;
		inhert(a);
		System.out.println("Value of a inside psvm"+a);
		
	}

}
