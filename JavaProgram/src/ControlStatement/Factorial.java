package ControlStatement;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no as u want factorial");
		int no=scan.nextInt();
		scan.close();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
