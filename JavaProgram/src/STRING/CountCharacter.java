package STRING;

public class CountCharacter 
{
	public static void main(String[] args) 
	{
		String s="hi this is sandeep kumar bhagat";
		int count = s.length()-s.replace("i", "").length();
		System.out.println("the no of i in '"+s+"' is ="+count);
	}

}
