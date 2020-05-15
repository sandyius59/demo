/**********************************************************************
* @Execution : default node : cmd> BinarySearch.java
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
***********************************************************************/package Arrays;
import java.util.*;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int flag=0;
		int a[]= {1,2,3,4,5,6};
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the kay");
		int key=scan.nextInt();
		scan.close();
		int low =0;
		int high=a.length;
		int mid=(low+high)/2;
		while(low>=high)
		{
			if(key==a[mid])
			{
				flag=1;
				break;
			}
			else if(key<a[mid])
			{
				high=mid-1;
			}
			else if(key>a[mid])
			{
				low=mid+1;
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
