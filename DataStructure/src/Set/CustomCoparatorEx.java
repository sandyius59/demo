/**********************************************************************
* @Execution : default node : cmd> CustomCorparatorEx.java
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
import java.util.Comparator;
public class CustomCoparatorEx 
{
	public static void main (String args[])
	{
		// Creating a tree set with customized comparator
        TreeSet<String> animals = new TreeSet<>(new CustomComparators());

        animals.add("Dog");
        animals.add("Zebra");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("TreeSet: " + animals);
	}
	public static class CustomComparators implements Comparator<String>
	{
		@Override
		public int compare(String animal1, String animal2)
		{
			int value = animal1.compareTo(animal2);
			if(value>0)
				return -1;
			else if(value<0)
				return 1;
			else 
				return 0;
		}
	}
}
