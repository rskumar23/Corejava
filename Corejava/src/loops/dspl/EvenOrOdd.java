package loops.dspl;

public class EvenOrOdd {
	public int[] getEven(int n)
	{
		int[] evenArray=new int[n];
		int j=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				evenArray[j]=i;
				j++;
			}
		}
		return evenArray;
	}
	
	public int[] getOdd(int n)
	{
		int[] oddArray=new int[n];
		int j=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				oddArray[j]=i;
				j++;
			}
		}
		return oddArray;
	}
	public void displayArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			System.out.print(arr[i]+" ");
		}
	}
}
