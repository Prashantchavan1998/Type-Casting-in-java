package typecasting;

public class NarrowingType 
{

	public static void main(String[] args) 
	{
		double a=2.5;
		long b=(long) a;
		int c=(int)a;

		
		System.out.println(b);
		System.out.println(c);
	}

}
