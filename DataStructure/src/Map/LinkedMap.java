/**********************************************************************
* @Execution : default node : cmd> LinkedMap.java
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
package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedMap 
{
	public static void main(String[] args) 
	{
        // Creating HashMap of even numbers
		LinkedHashMap<String, Integer> Number1 = new LinkedHashMap<>();

        // Using put()
        Number1.put("Two", 2);
        Number1.put("Four", 4);

        // Using putIfAbsent()
        Number1.putIfAbsent("Six", 6);
        System.out.println("HashMap of even numbers: " + Number1);

        //Creating HashMap of numbers
        HashMap<String, Integer> number2 = new HashMap<>();
        number2.put("One", 1);

        // Using putAll()
        number2.putAll(Number1);
        System.out.println("HashMap of numbers: " + number2);
        
        // remove method with single parameter
        int value = number2.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = number2.remove("Four", 4);
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated HashMap: " + number2);
        
    }
}
