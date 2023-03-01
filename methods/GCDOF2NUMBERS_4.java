package methods;

import java.util.Scanner;

public class GCDOF2NUMBERS_4 {
	static int gcd(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else if(b>a)
			{
				b=b-a;
			}
		}
		return b;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=sc.nextInt();
		System.out.println("Enter the value of b :");
		int b=sc.nextInt();
		int c=gcd(a,b);
		System.out.println("Gcd of 2 enter numbers is : "+c);
		}
}
