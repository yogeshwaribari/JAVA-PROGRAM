/*4. Write a Java program to create a `Calculator` class with `add()`, 
`subtract()`, `multiply()`, and `divide()` methods. */
import java.util.*;
class Calculator
{
	void add(int a,int b)
	{
		System.out.println("Addition :"+(a+b));
	}
	void subtract(int a,int b)
	{
		System.out.println("Subtraction :"+(a-b));
	}
	void multiply(int a,int b)
	{
		System.out.println("Multiplication :"+(a*b));
	}
	void divide(int a,int b)
	{
		System.out.println("Division :"+(a/b));
	}
}
class Q4Calculator
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Calculator c=new Calculator();
		System.out.println("Enter two numbers");
		int a=xyz.nextInt();
		int b=xyz.nextInt();
		c.add(a,b);
		c.subtract(a,b);
		c.multiply(a,b);
		c.divide(a,b);
	}
}