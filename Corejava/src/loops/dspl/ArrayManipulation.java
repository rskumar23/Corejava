package loops.dspl;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner scannerInput=new Scanner(System.in);
		
		ArrayReverse arrReverse=new ArrayReverse();
		
		System.out.println("how many elements....??");
		
		int n=scannerInput.nextInt();
		
		int[] arr=arrReverse.acceptArray(n);
		
		System.out.println("------Array before reverse---------");
		
		arrReverse.displayArray(arr);
		
		int[] revarr=arrReverse.reverseArray(n, arr);
		
		System.out.println("\n------Array after reverse------------");
		
		arrReverse.displayArray(revarr);
		
		scannerInput.close();
	}

}
