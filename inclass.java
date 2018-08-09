import java.io.*;

class figure
{

double var1 = 2;
double var2 = 4;

			
		void callmethds()
		{
			
			circle c = new circle();
			c.circlemethod();
			
			
			triangle t = new triangle();
			t.trianglemethod();
			
		}
	
	

	class circle
	{
		void circlemethod()
		{
			double a = 3.14*var1*var2;			
			System.out.println("Area of circle is : "+a);
		}


	}

	class triangle
	{
		void trianglemethod()
		{
			double a = 0.5*var1*var2;
			System.out.println("Area of triangle is : "+a);		
		}
	
	
	}
	


}




class inclass
{
	public static void main(String args[])
	{
		figure f = new figure();
		f.callmethds();	
	
	}
}

