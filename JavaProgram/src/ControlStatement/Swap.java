package ControlStatement;

import java.util.Scanner;

public class Swap 
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first no ");
		int a=scan.nextInt();
		System.out.println("enter the second no");
		int b = scan.nextInt(); 
		System.out.println("Before swap number a = "+a+" and b = "+b);
//		int temp=a;
//		a=b;
//		b=temp;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap number a = "+a+" and b = "+b);
		scan.close();
	}
}
