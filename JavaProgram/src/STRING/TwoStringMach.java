package STRING;

public class TwoStringMach {

	public static void main(String[] args) 
	{
		String s1 = "java is programming language";
		String s2 = "language is programming java";
		if(s1.length()!=s2.length())
		{
			System.out.println("Not posiable");
		}
		else
		{
			String s3= s1+s2;
			if(s3.contains(s2))
			{
				System.out.println("s1 is rotation of s2");
			}
			else
			{
				System.out.println("s1 is not rotation of s2");
			}
		}
	}

}
