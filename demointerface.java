//Demo interface 

interface myinter
{
void methd1();
void methd2();

}

class methds implements myinter
{

	public void methd1()
	{
		System.out.println("This is method 1");
	}	
	
	public void methd2()
	{
		System.out.println("This is method 2");
	}


}


class demointerface
{
	public static void main(String args[])
	{
		methds m = new methds();
		m.methd1();
		m.methd2();	
	}
}
