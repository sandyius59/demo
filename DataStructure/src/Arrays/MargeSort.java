package Arrays;

public class MargeSort 
{
	int array[];
	int tempmargeArr[];
	int lengh;
	
	public static void main(String[] args) 
	{
		int inputArr[]= {48,36,13,52,19,94,21};
		MargeSort ms=new MargeSort();
		ms.Sort(inputArr);
		
		for(int i:inputArr)
		{
			System.out.println(i+" ");
		}
	}
	public void sort(int inputArr[])
	{
		this.array=inputArr;
		this.lengh=inputArr.length;
		this.tempmargeArr=new int[lengh];
		divideArray(0.lengh-1);
	}
	public void dividArray(int lowerindex,int higerindex)
	{
		if(lowerindex<higerindex)
		{
			int middle=lowerindex+(higerindex-lowerindex)/2;
			//it's will the left side of an array 
			divideArray(lowerindex,middle);
			//it will sort the right side of an array
			divideArray(middle+1,higerindex);
			MergeArray(lowerindex,middle,higerindex);
			
		}
	}
	public void MergeArray(int lowerindex,int higerindex)
	{
		for(int i=lowerindex;i<=higerindex;i++)
		{
			tempmargeArr[i]=array[i];
		}
		int i=lowerindex;
		int j=middle+1;
		int k= lowerindex;
	}
	
	while (i<=middle && j<=higerindex)
	{
		if(tempmargeArr[i]<=tempmargeArr[j])
		{
			array[k]=tempmargeArr[i];
			i++
		}
		else
		{
			array[k]=tempmargeArr[i];
			i++;
		}
		k++
	}
	while(i<=middle)
	{
		array[k]=tempmargeArr[i];
		k++;
		i++;
	}

}
