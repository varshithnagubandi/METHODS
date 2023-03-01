package methods;
import java.util.Scanner;
public class Primenumberornot {
	static boolean prime(int n)
	{
		int i;
		for(i=2;i<=n/2;i++)
		{
			if((n%i)==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the value of n : ");
		int n=sc.nextInt();
		boolean c=prime(n);
		if(c)
		{
			System.out.println(n+" is an PRIME NUMBER");
		}
		else
		{
			System.out.println(n+"  is not an PRIME NUMBER");
		}
	}
}
