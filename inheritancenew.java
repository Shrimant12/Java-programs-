//Inheritance 

class A
{
	void meth1()
	{
		System.out.println("I am from method1 of class A");
		
	}
	
}

class B extends A 
{
	void meth2()
	{
		System.out.println("I am from method2 of  class B");
			
	}


}

class inheritancenew
{
	public static void main(String args[])
	{
		B b = new B();
		b.meth1();
		b.meth2();
	
	}


}
