import java.util.*;

class Addition
{
	public static void main (String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		int c = a+b;
		
		System.out.println("Addition =" +c);
	}
}