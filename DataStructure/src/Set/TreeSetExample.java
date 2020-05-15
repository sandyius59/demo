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

import java.util.TreeSet;

public class TreeSetExample 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer>num=new TreeSet<>();
		num.add(1);
		num.add(5);
		num.add(4);
		num.add(8);
		System.out.println("treeset "+num);
		System.out.println("remove element "+num.remove(4));

		
	}

}
