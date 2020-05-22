package array;

public class CommonElementInThree 
{
	public static void commonElement(int arr1[],int arr2[],int arr3[]) 
	{
		int x=0,y=0,z=0;
		while(x < arr1.length && y < arr2.length && z < arr3.length)
		{
			if(arr1[x]==arr2[y] && arr2[y]==arr3[z])
			{
				System.out.println(arr1[x]);
				x++;
				y++;
				z++;
			}
			else if(arr1[x]>arr2[y])
			{
				y++;
			}
			else if(arr2[y]>arr3[z])
			{
				z++;
			}
			else 
			{
				x++;
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4,5,7,23};	
		int arr2[]= {1,4,7,8,9};
		int arr3[]= {0,1,4,5,7};
		
		commonElement(arr1,arr2,arr3);
		
	}

}
