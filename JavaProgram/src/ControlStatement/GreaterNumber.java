package ControlStatement;

import java.util.Scanner;

public class GreaterNumber 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number 1 value");
		int num1=scan.nextInt();
		System.out.println("Enter number 2 value");
		int num2=scan.nextInt();
		System.out.println("Enter number 3 value");
		int num3=scan.nextInt();
		scan.close();
		if(num1>num2 && num1>num3)
		{
			System.out.print(num1+" is grater then other");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+" is grater then other");
		}
		else
			System.out.println(num3+" is greater then other");

	}

}
