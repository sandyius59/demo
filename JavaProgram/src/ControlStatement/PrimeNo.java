package ControlStatement;
import java.util.Scanner;
public class PrimeNo 
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Number");
		int no=scan.nextInt();
		scan.close();
		int temp=0;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(no+" is not prime no");
		}
		else
			System.out.println(no+" is prime no");
	}
}
