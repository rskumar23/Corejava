package loops.dspl;

public class Password {
	public String encryptPassword(String str)
	{
		String encString="";
		int ch;
		String con;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=48 || str.charAt(i)!=57 || str.charAt(i)!=' ' || str.charAt(i)!='@')
			{
				if(str.charAt(i)!='z' || str.charAt(i)!='Z' || str.charAt(i)!='y' || str.charAt(i)!='Y' || str.charAt(i)!='x' 
						|| str.charAt(i)!='X' || str.charAt(i)!='w' || str.charAt(i)!='W')
				{
					System.out.println("here");
					ch=(int)str.charAt(i)+4;
					encString=encString+(char)ch;
				}
				else
				{
					if(str.charAt(i)=='w' || str.charAt(i)=='W')
					{
						con="A";
						encString=encString+con;
						System.out.println(encString);
					}
				}
			}
			else
			{
				encString=encString+str.charAt(i);
			}
			
		}
		return encString;
	}
}
