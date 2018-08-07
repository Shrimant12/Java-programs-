	//Method overloading
class overloaddemo
{
	void test()
	{
	System.out.println("NO parameters passed");
	}
	
	void test(int a)
	{
		System.out.println("a : "+a);
	}
	
	void test(int a,int b)
	{
		System.out.println("a and b : "+a+" "+b);
	
	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			

	double test(double a)
	{
		System.out.println("double a : "+a);
	
		return a*a;
		
	}



}


class loaddemo
{
	public static void main(String args[])
	{
			
		overloaddemo old = new overloaddemo();
		
		
		double result;
		
		old.test();
		old.test(10);
		old.test(10,10);
		
		result = old.test(2.2);
		System.out.println("result is : "+result);
		
	}
}
