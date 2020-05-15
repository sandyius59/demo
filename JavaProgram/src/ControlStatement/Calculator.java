package ControlStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{ 
		String yn;
		do 
		{
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter first no");
			int num1=scan.nextInt();
			System.out.println("Enter second no");
			int num2=scan.nextInt();
			System.out.println("choose Sysbol (+,-,*,/)");
			String sym=scan.next();
			int res;
			switch(sym)
			{
			case "+": 
				res=num1+num2;
				System.out.println("Addition is = "+ res);
				break;
			case "-":
				res=num1-num2;
				System.out.println("subtration"+res);
				break;
			case "*":
				res=num1*num2;
				System.out.println("Multipicatin = "+res);
				break;
			case "/":
				res=num1/num2;
				System.out.println("divition is "+res);
				break;
			default:System.out.println("Invalid input");
			}
			System.out.println("Continue for pess Y else n");
			yn=scan.next();
			
		}
		while(yn.equals("y")||yn.equals("Y"));
		
		
	}

}
