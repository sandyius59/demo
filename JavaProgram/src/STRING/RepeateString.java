package STRING;

import java.util.*;

public class RepeateString 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the strings");
		String str=scan.next();
		scan.close();
		
		char charArray[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(str.lastIndexOf(charArray[i])!=str.indexOf(charArray[i]))
			{
				System.out.print(charArray[i]);
			}
		}
		
	}
}
