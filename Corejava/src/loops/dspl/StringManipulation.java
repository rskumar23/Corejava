package loops.dspl;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		
		Scanner getinputScanner=new Scanner(System.in);
		
		System.out.println("Enter your password");
		
		String str=getinputScanner.next();
		
		Password pass=new Password();
		
		System.out.println(pass.encryptPassword(str));
		
		getinputScanner.close();
	}

}
