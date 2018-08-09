interface inter1
{
void methd1();
}


interface inter2 extends inter1 
{
 void methd2();
}


class methds implements inter2
{
	public	void methd1()
	{
		System.out.println("This is method 1");
	}
	
	public void methd2()
	{
		System.out.println("This is method 2");
	}


}


class demointerextends
{
	public static void main(String args[])
	{
		methds m = new methds();
		m.methd1();
		m.methd2();	
	}
}
