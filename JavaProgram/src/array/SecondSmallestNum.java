package array;

public class SecondSmallestNum 
{
	public static int getSecondSmallest(int arr[])
	{
		int Smallesst=Integer.MAX_VALUE;
		int SecondSmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<Smallesst)
			{
				Smallesst=arr[i];
			}
			if(arr[i]>Smallesst && arr[i]<SecondSmallest)
			{
				SecondSmallest=arr[i];
			}
		}
		return SecondSmallest;
	}
	public static void main(String[] args) 
	{
		int arr[]= {-1,10,2,3,4,5};
		int result=getSecondSmallest(arr);
		System.out.println("the second smallest number is "+result);
		
	}

}
