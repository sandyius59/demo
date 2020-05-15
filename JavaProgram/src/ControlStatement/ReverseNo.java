package ControlStatement;
import java.util.Scanner;
public class ReverseNo 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int no = scan.nextInt();
		int rem,rev=0;
		scan.close();
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("reverse is = "+rev);
	}

}
