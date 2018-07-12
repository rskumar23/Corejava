package loops.dspl;

public class CheckPalindromString {
	public boolean checkPalindromString(String str)
	{
		String reverseString="";
		for(int i=(str.length())-1;i>=0;i--)
		{
			reverseString=reverseString+str.charAt(i);
		}
		if(reverseString.equals(str))
		{
			return true;
		}	
		return false;
	}
	public boolean checkCharPaliString(String str)
	{
		int j=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(j)!=str.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
}
