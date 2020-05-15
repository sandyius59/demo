package ControlStatement;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=scan.nextInt();
		scan.close();
		int t1=no;
		int lang=0;
		while(t1!=0)
		{
			lang=lang+1;
			t1=t1/10;
		}
	//System.out.println(lang);
	
		int t2=no;
		int rem;
		int arm=0;
		while(t2!=0)
		{
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=lang;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no)
		{
			System.out.println(no+" is Armstrong");
		}
		else
			System.out.println(no+" is not Armstrong");
	}

}
