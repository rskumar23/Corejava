package loops.dspl;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scannerInput=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=scannerInput.nextInt();
		int f=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				f=1;
			}
		}
		if(f==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is a not prime number");
		}
		scannerInput.close();
	}

}
