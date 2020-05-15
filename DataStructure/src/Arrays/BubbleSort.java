/**********************************************************************
* @Execution : default node : cmd> BubbleSort.java
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

public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[]= {1,2,4,3,8,5};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
