package STRING;
import java.util.Scanner;
public class ReverseString 
{
	//Using loop
	public void reverse()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String str=scan.next();
		scan.close();
		String reverse="";
		 for(int i=str.length()-1;i>=0;i--)
		 {
		  reverse=reverse+str.charAt(i);
		 }
		 System.out.println("Reverse of java2blog is:"+reverse);
	}
	public static void main(String[] args)
	 {
		ReverseString sc=new ReverseString();
		sc.reverse();
	 }
}