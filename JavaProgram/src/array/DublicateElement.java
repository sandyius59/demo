package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class DublicateElement 
{
	//by normal method
	public static void dublicate()
	{
		System.out.print("dublicate element are ");
		int arr1[]= {1,2,3,4,5,1,2};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j] && i!=j)
				{
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
	//by set method
	public static void SetDublicate()
	{
		System.out.print("Dublicate element by set are ");
		int arr2[]={1,2,3,4,5,1,2,4};
		Set<Integer> s= new HashSet<>();
		for(int no:arr2)
		{
			if(s.add(no)==false)
			{
				System.out.print(no+" ");
			}
		}
	}
	//by HashTable method
	public static void dublicateMap()
	{
		System.out.print("Dublicate element by HashTable ");
		int arr3[]={1,2,3,4,5,1,2,4,3};
		Map<Integer,Integer> hm= new HashMap<>();
		for(int no:arr3)
		{
			Integer cout=hm.get(no);
			if(cout==null)
			{
				hm.put(no, 1);
			}
			else
			{
				cout=cout+1;
				hm.put(no,cout);
			}
		}
		Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
		for(Map.Entry<Integer, Integer>mp:es)
		{
			if(mp.getValue()>1)
			{
				System.out.print(mp.getKey()+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		dublicate();
		System.out.println();
		SetDublicate();
		System.out.println();
		dublicateMap();
	}

}
