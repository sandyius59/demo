package STRING;
public class Convert 
{
	//convert String to Integer
	void StringToInt()
	{
		String str= "2000";
		//int i = Integer.parseInt(str);
		int i = Integer.valueOf(str);
		System.out.println(i);
	}
	//convert Integer to string
	void IntToString()
	{
		int i=1000;
		//String str =Integer.toString(i);
		Integer str =Integer.valueOf(i);
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Convert sc=new Convert();
		sc.StringToInt();
		sc.IntToString();

	}


}
