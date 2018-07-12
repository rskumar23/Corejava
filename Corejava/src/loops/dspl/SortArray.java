package loops.dspl;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		Scanner getInputScanner = new Scanner(System.in);
		
		System.out.println("Enter how many numbers");
		
		int n=getInputScanner.nextInt();
		
		System.out.println("Enter "+n+" elements");
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=getInputScanner.nextInt();
		}
		
		ReturnSOrtedArray sortArray=new ReturnSOrtedArray();
		
		System.out.println("Array before sort");
		
		sortArray.displayArray(arr);
		
		System.out.println("\nArray after sort");
		
		int[] sortedArray=sortArray.sortArray(arr);
		
		sortArray.displayArray(sortedArray);
		
		getInputScanner.close();
	}

}
