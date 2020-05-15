package STRING;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sandeep";
		String s2 = "deepak";
		System.out.println("before swaping a="+s1+" and b="+s2);
//		String swap =s1;
//		s1=s2;
//		s2=swap;
		
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("after swaping a="+s1+" and b="+s2);
	}

}
