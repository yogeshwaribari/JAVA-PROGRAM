/*Question 27: Create a base class Shape with method calculate().
Create a child class Rectangle that overrides calculate() to compute area.
Create another child class Box that overrides calculate() to compute volume.

Use constructor chaining (super()).
Use polymorphism (Shape reference) to store 2 Box objects in array and call calculate().
Asked In Practice Assignment
Description
This program demonstrates method overriding across multiple levels and runtime polymorphism.
Input
Enter number of Boxes: 2

Enter Length: 5
Enter Breadth: 4
Enter Height: 3

Enter Length: 6
Enter Breadth: 2
Enter Height: 5
Output
Volume: 60
Volume: 60*/
import java.util.*;
class Shape
{
	int length;
	int breadth;
	int height;
	void calculate()
	{
		System.out.println("Calculate Areas");
	}
	Shape(int length,int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
}
class Rectangle extends Shape
{
	Rectangle(int length,int breadth,int height)
	{
		super(length,breadth,height);
	}
	void calculate()
	{
		int area=length*breadth;
		System.out.println("Area :"+area);
	}
}
class Box extends Rectangle
{
	Box(int length,int breadth,int height)
	{
		super(length,breadth,height);
	}
	void calculate()
	{
		int volume=length*breadth*height;
		System.out.println("Volume :"+volume);
	}
}
class Q27Shape
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Boxes");
		int n=xyz.nextInt();
		Shape s[]=new Shape[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter length");
			int length=xyz.nextInt();
			System.out.println("Enter breadth");
			int breadth=xyz.nextInt();
			System.out.println("Enter Height");
			int height=xyz.nextInt();
			s[i]=new Box(length,breadth,height);
		}
		for(int i=0;i<n;i++)
		{
			s[i].calculate();
		}
	}
}
