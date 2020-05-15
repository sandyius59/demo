package STRING;

import java.util.Scanner;

public class CountThatWord {

	public static void main(String[] args) 
	{
		System.out.println("enter the string");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		System.out.println(s.length());

	}

}
