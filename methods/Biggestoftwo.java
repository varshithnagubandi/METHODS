package methods;

import java.util.Scanner;

public class Biggestoftwo {
	static int biggest(int x,int y)
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
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b=sc.nextInt();
		int c=biggest(a,b);
		System.out.println("Biggest of 2 numbers is :"+c);
		
		
	}

}
