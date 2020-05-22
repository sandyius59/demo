package array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElements 
{

	public static void main(String[] args) 
	{
		   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   System.out.println("Original Array : "+Arrays.toString(my_array));
		   Scanner scan =new Scanner(System.in);
		   System.out.println("enter the index");
		   int removeIndex=scan.nextInt();
		   for(int i = removeIndex; i < my_array.length -1; i++)
		   {
		        my_array[i] = my_array[i + 1];
		   }
		   System.out.println("the index of "+removeIndex+" is deleted "+Arrays.toString(my_array));	
		   scan.close();
	}

}
