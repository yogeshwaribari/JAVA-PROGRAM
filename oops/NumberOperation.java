/*uestion 16: Write a Java program to implement Number Operation using Method Overloading.
Create a class NumberOperation and overload method calculate():
- calculate(int a, int b) => Find addition of two numbers
- calculate(int a, int b, int c) => Find the largest among three numbers

Input:
Enter two numbers : 10 20
Enter three numbers : 12 45 30

Output:
Addition : 30
Largest Number : 45

Explanation:
Method overloading allows the same method name to perform different tasks based on parameters.
calculate(int a, int b):
- Adds two numbers: 10 + 20 = 30. Prints Addition : 30.
calculate(int a, int b, int c):
- Finds largest using if-else: 12, 45, 30 => 45 is the largest.
Java automatically selects the correct method based on number of arguments.
This is compile-time polymorphism (method overloading).
Method overloading improves code readability by using one name for related operations.
*/
import java.util.*;
class NumberOperation
{
	void calculate(int a,int b)
	{
		int add=a+b;
		System.out.println("Addition : "+add);
	}
	void calculate(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println("Largest Number :"+a);
		}
		else if(b>c)
		{
			System.out.println("Largest Number :"+b);
		}
		else
		{
			System.out.println("Largest Number :"+c);
		}
	}
	public static void main(String args[])
	{
		Scanner xyz=new Scanner(System.in);
		NumberOperation num=new NumberOperation();
		
		System.out.println("Enter Two Numbers");
		int a=xyz.nextInt();
		int b=xyz.nextInt();
		
		System.out.println("Enter Three Numbers");
		int x=xyz.nextInt();
		int y=xyz.nextInt();
		int z=xyz.nextInt();
		
		num.calculate(a,b);
		num.calculate(x,y,z);
	}
}
