import java.util.*;

class palindrome
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
	
		int rem,reverse=0;
		
		System.out.println("Enter a number\n");	
		int num = sc.nextInt();
		
		int temp = num;
		
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			reverse = reverse*10 + rem;
			
		}		
		
		if(temp == reverse )
		{
			System.out.println("Number is palindrome");	
		}			
		else
		{
			System.out.println("Number is not palindrome");
		}
			
			
	
	}
	



}
