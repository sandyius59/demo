package STRING;

import java.util.Arrays;
import java.util.*;
public class Anagram 
{
	public void isAnagram() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string 1");
		String s1=scan.next();
		System.out.println("enter string 2");
		String s2=scan.next();
		scan.close();
		s1 =s1.replaceAll("\\s", "");
		s2 =s2.replaceAll("\\s", "");
		boolean status = true;
		if (s1.length() != s2.length()) 
		{
			status = false;
		} 
		else 
		{
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) 
		{
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} 
		else 
		{
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}
	public static void main(String[] args)
	{
		Anagram sc=new Anagram();
		sc.isAnagram();
		
	}
}
