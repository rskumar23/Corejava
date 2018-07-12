package loops.dspl;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner getScannerInput=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=getScannerInput.nextInt();
		
		EvenOrOdd evnodd=new EvenOrOdd();
		
		int[] evnArray=evnodd.getEven(n);
		
		int[] oddArray=evnodd.getOdd(n);
		
		System.out.println("-----Even numbers are-----");
		
		evnodd.displayArray(evnArray);
		
		System.out.println("\n-----Odd numbers are-----");
		
		evnodd.displayArray(oddArray);
		
		getScannerInput.close();
	}

}
