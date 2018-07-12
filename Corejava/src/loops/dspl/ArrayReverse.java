package loops.dspl;

import java.util.Scanner;

public class ArrayReverse {
	public int[] acceptArray(int size)
	{
		Scanner getInputScanner=new Scanner(System.in);
		
		System.out.println("Enter "+size+" numbers");
		
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=getInputScanner.nextInt();
		}
		
		getInputScanner.close();
		
		return arr;
	}
	
	public int[] reverseArray(int size,int[] arr)
	{
		int[] reverseArray=new int[size];
		int j=0;
		for(int i=size-1;i>=0;i--)
		{
			reverseArray[j]=arr[i];
			j++;
		}
		return reverseArray;
	}
	
	public void displayArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
