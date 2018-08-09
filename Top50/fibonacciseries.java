/** 
* Java program to calculate and print Fibonacci number using both recursion 
* and Iteration.
**/

import java.util.Scanner;


class forloop
{
	Scanner sc = new Scanner(System.in);	
	
	public void forloopmethod()
	{	
		System.out.println("Fibonacci series program");
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
	
		System.out.println("Fibonacci series for "+number+" is \n");
		
		
		for(int i=1; i<=number; i++)
		{
			System.out.print(fibonacci(i) +" ");

		}	
	
	} //EOF
	

public static int fibonacci(int number)
{
	 if(number == 1 || number == 2)
	 { 
	 	return 1; 
	 }
	 
	 return fibonacci(number-1) + fibonacci(number -2); //tail recursion 
} 


	
}

/*
class recur
{


}
*/

class fibonacciseries
{
	public static void main(String args[]) 
	{
		forloop fl = new forloop();
		fl.forloopmethod();	
	
	
	}

}




