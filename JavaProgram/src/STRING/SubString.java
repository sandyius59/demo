package STRING;
import java.util.*;
public class SubString 
{
	public static void main(String args[])
	{
		try 
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = scan.next();
		scan.close();
		System.out.println("the SubString are");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}