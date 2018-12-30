//Simple arithmetic operations 

import java.util.Scanner;

class arithmetic
{
	
	public static void main(String args[])
	{
				
			int x,y;
			int add,sub,mult;
			
			Scanner sc = new Scanner(System.in);


			
			System.out.println("Enter first number\n");
			x = sc.nextInt();
			
			System.out.println("Enter second number\n");
			y = sc.nextInt();
		
			int add = x+y;
			int sub = x-y;
			int mult = x*y;
			int div = x/y;
						
			System.out.println("Addition is : "+add);
			System.out.println("Substraction is : "+sub);
			System.out.println("Multiplication is : "+mult);
			System.out.println("Division is : "+div);


				
		

	}








}
