package ControlStatement;
import java.util.Scanner;
public class PalindromeNo 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int no = scan.nextInt();
		int temp=no;
		int rem;
		int rev=0;
		scan.close();
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+" is palindrome ");
		}
		else
			System.out.println(no+" is not palindrome");
			
	}

}
