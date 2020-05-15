/**********************************************************************
* @Execution : default node : cmd> LinearSearch.java
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
package Arrays;
import java.util.*;
public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int i ,flag=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the kay");
		int key=scan.nextInt();
		scan.close();
		for(i=0;i<5;i++)
		{
			if(key==a[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("key is found");
		}
		else
		{
			System.out.println("key is not found");
		}
		
	}

}
