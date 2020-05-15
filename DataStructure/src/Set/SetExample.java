/**********************************************************************
* @Execution : default node : cmd> TreeSetExample.java
* 
* 
* @Purpose : dataStructure
* 
* @description :
* 
* 
* @overview :  
* @author : Sandeep kumar maurya  <sandeepkumarraj58@gmail.com>
* @version : 1.0
* @since : 28/03/2020
*
***********************************************************************/
package Set;
import java.util.*;
public class SetExample 
{
	public static void main(String args[])
	{
		Set<Integer>a=new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
		Set<Integer>b=new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,5}));
		
		//to find union
		Set<Integer>union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("Union of two set");
		System.out.println(union);
		
		//to find intersection
		Set<Integer>Intersection=new HashSet<Integer>(a);
		Intersection.retainAll(b);
		System.out.println("Intersection of two set");
		System.out.println(Intersection);
		
		//to find symmetric difference 
		Set<Integer>difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.println("difference of the two set");
		System.out.println(difference);
	}
}
