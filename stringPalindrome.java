import java.util.*;

class stringPalindrome
{
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(System.in);
		
		String name = "Chaitraliii";
		String rev = "";
		
		int lngth = name.length();
		System.out.println(lngth);
		
		for(int i=lngth-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		
		}
			
			System.out.println(rev);
	
	
	}





}
