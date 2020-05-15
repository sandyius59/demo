package STRING;

import java.util.Scanner;

public class LenghtOfString 
{	
	Scanner scan = new Scanner(System.in);
	
	public void lenght()
	{
		System.out.println("enter a string");
		String str=scan.next();
		//scan.close();
		System.out.println(str.length());
	}
	@SuppressWarnings("unused")
	public void lenght2() 
	{
		//Scanner scan = new Scanner(System.in);
		System.out.println("enter a 2nd string ");
		String str2=scan.next();
		int length=0;
		char[] strCharArray=str2.toCharArray();
		for(char c:strCharArray)
		{
		  length++;
		}
		 // return length;
		  System.out.println(length);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LenghtOfString sc = new LenghtOfString();
		//sc.lenght();
		sc.lenght2();
		

	}

}
