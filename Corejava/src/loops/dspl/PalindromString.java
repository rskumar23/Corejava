package loops.dspl;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		Scanner getInputScanner=new Scanner(System.in);
		
		CheckPalindromString palindromString=new CheckPalindromString();
		System.out.println("Enter a String");
		
		String str=getInputScanner.next();
		
		if(palindromString.checkPalindromString(str) || palindromString.checkCharPaliString(str))
		{
			System.out.println(str+" is palindrom string");
		}
		else
		{
			System.out.println(str+" is not a palindrom string");
		}
		getInputScanner.close();
	}

}
