/*5. Write a Java program using an Abstract class. Create an abstract class Shape with an 
abstract method area(), and implement it in a Circle class. */

abstract class Shape
{
	abstract void area();
}
class Circle extends Shape
{
	void area()
	{
		System.out.println("PI*r*r");
	}
}
class Q5Abstract
{
	public static void main(String x[])
	{
		Circle c=new Circle();
		c.area();
	}
}