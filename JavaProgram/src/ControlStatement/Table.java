package ControlStatement;
import java.util.Scanner;
public class Table 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter as u want table");
		int t=scan.nextInt();
		scan.close();
		for(int i=1;i<=10;i++)
		{
			System.out.println(t*i);
		}
	}

}
