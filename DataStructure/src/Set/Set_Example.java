/**********************************************************************
* @Execution : default node : cmd> Set_Example.java
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
public class Set_Example 
{
	public static void main(String args[]) 
	{
		Set<String>Hash_set=new HashSet<String>();
		Hash_set.add("a sandeep");
		Hash_set.add("z deepeak");
		Hash_set.add("sandy");
		Hash_set.add("deepu");
		Hash_set.add("sandeep");
		Hash_set.add("kumar");
		System.out.println("set output without dublicates");
		System.out.println(Hash_set);
		System.out.println("sorted set after passing into treeSet");
		Set<String>tree_set=new TreeSet<String>(Hash_set);
		System.out.println(tree_set);
	}
}
