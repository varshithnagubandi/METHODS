package methods;

import java.util.Scanner;

public class Largestoftwonumbers_1 {
	
	
	static int max(int x,int y)
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
		Scanner sc=new Scanner (System.in);
		int a,b,c;
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		c=max(a,b);
		System.out.println(c);
		
		
		
	}

}
