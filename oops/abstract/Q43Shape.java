/*Question 43: Create an abstract class Shape to calculate area of different shapes.

Create abstract class Shape with:

Abstract method calculateArea()

Create subclasses:

Circle ? area = ? × r × r

Rectangle ? area = length × width

Program should take input and calculate respective area.

Input
Shape: Circle
Radius: 5
Output
Area of Circle: 78.5*/
import java.util.*;
abstract class Shape
{
	abstract void calculateArea();
}
class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	public void calculateArea()
	{
		double radius=3.14*r*r;
		System.out.println("Area of Circle :"+radius);
	}
}
class Rectangle extends Shape
{
	int length,breath;
	Rectangle(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}
	public void calculateArea()
	{
		System.out.println("Area of Rectangle :"+(length*breath));
	}
}
class Q43Shape
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("1.Circle \n2.Rectangle");
	System.out.println("Enter your choice");
	int choice=xyz.nextInt();
	Shape s;
	switch(choice)
	{
		case 1:
		System.out.println("Enter radius");
		int r=xyz.nextInt();
		s=new Circle(r);
		s.calculateArea();
		break;
		
		case 2:
		System.out.println("Enter length and breath");
		int length=xyz.nextInt();
		int breath=xyz.nextInt();
		s=new Rectangle(length,breath);
		s.calculateArea();
		break;
		
		default :
		System.out.println("Wrong choice");
	}
	}
}