package ControlStatement;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scan.nextInt();
		int b =Integer.toString(year).length();
		scan.close();
		if(b==4)
		{
			{
				if((year%400==0)||(year%4==0 && year%100!=0))
				{
					System.out.println(year+" is leap year");
				}
				else
					System.out.println(year+" is not leap year");
			}
		}
		else
		{
			System.out.println("invlid input");
		}
	}
}
