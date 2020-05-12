package CreationalDesignPattern;

class Singleton
{
	private static Singleton Single_instance=null;
	public String s;
	private Singleton()
	{
		s="hello I am a String part of Singleton";
	}
	public static Singleton getIntance()
	{
		if(Single_instance==null)
			Single_instance=new Singleton();
		return Single_instance;
	}
}


public class SingletonDesign 
{
	public static void main(String args[])
	{
		Singleton x = Singleton.getIntance();
		Singleton y = Singleton.getIntance();
		Singleton z = Singleton.getIntance();
		
		x.s=(x.s).toUpperCase();
		System.out.println("String from x is"+x.s);
		System.out.println("String from y is"+y.s);
		System.out.println("String from z is"+z.s);
		
		z.s=(x.s).toLowerCase();
		System.out.println("String from x is"+x.s);
		System.out.println("String from y is"+x.s);
		System.out.println("String from z is"+x.s);
	}
}
