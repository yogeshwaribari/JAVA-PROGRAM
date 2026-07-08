/*Question 112: Write a Java program to find area of shapes using interface.
Asked In Practice Assignment
Create an interface Shape with method area().
Implement it in classes Rectangle and Triangle.
Rectangle ? area = length × breadth
Triangle ? area = 0.5 × base × height
Let the user choose the shape.

Input:
Enter choice (1-Rectangle, 2-Triangle): 2
Enter base: 10
Enter height: 5

Output:
Area of Triangle : 25.0*/
import java.util.*;
interface Shape
{
	void area();
}
class Rectangle implements Shape
{
	int length,breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void area()
	{
		int result=length*breadth;
		System.out.println("Area of rectangle :"+result);
	}
}
class Triangle implements Shape
{
	double base,height;
	Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	public void area()
	{
		double result=0.5*base*height;
		System.out.println("Area of triangle :"+result);
	}
}
class Q112Shape
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your choice 1.Rectangle 2.Triangle");
		int choice=xyz.nextInt();
		
		Shape s;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Length");
			int length=xyz.nextInt();
			System.out.println("Enter breadth");
			int breadth=xyz.nextInt();
			s=new Rectangle(length,breadth);
			s.area();
			break;
			
			case 2:
			System.out.println("Enter base");
			double base=xyz.nextDouble();
			System.out.println("Enter height");
			double height=xyz.nextDouble();
			s=new Triangle(base,height);
			s.area();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}
