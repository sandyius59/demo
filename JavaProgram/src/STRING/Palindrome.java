package STRING;
import java.util.*;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string ");
		String str=scan.next();
		scan.close();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println(str+" is palindrome ");
		}
		else
			System.out.println(str+" is not palindrome");
		
	}

}
