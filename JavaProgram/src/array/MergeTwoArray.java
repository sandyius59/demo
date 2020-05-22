package array;

public class MergeTwoArray 
{
	public static void merge(int arr1[],int arr2[])
	{
		int leng1=arr1.length;
		int leng2=arr2.length;
		
		int arr3[]=new int[leng1+leng2];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			arr3[arr1.length+j]=arr2[j];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int arr1[]= {11,1,2,3,4,5};
		int arr2[]= {6,7,8,9,10,0};
		merge(arr1,arr2);
	}

}
