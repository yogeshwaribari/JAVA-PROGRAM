/*Question 17: Write a Java program to implement an Area Calculator using Method Overloading.
Create a class AreaCalculator and overload method area():
- area(int side) => Calculate area of square
- area(int length, int breadth) => Calculate area of rectangle
- area(int base, int height, int type) => Calculate area of triangle
Asked In: Practice assignment
Run
Clear
Input:
Enter side : 5
Enter length and breadth : 10 4
Enter base and height : 8 6

Output:
Area of Square : 25
Area of Rectangle : 40
Area of Triangle : 24

Explanation:
Method overloading is used to compute different areas using one method name area().
area(5):
- Square area = side * side = 5 * 5 = 25
area(10, 4):
- Rectangle area = length * breadth = 10 * 4 = 40
area(8, 6, type):
- Triangle area = (base * height) / 2 = (8 * 6) / 2 = 24
- The third parameter 'type' distinguishes it from the rectangle overload.
Java selects the correct version based on number/type of arguments.
This demonstrates practical usage of method overloading for geometric calculations.*/
import java.util.*;
class AreaCalculator
{
	void area(int side)
	{
		int a=side*side;
		System.out.println("Area of Square :"+a);
	}
	void area(int l,int b)
	{
		int r=l*b;
		System.out.println("Area of Rectangle :"+r);
	}
	void area(int base,int height,int type)
	{
		int area=(base*height)/2;
		System.out.println("Area of Triangle :"+area);
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		AreaCalculator ac=new AreaCalculator();
		System.out.println("Enter side");
		int s=xyz.nextInt();
		System.out.println("Enter length and breadth");
		int l=xyz.nextInt();
		int b=xyz.nextInt();
		System.out.println("Enter base and height ");
		int base=xyz.nextInt();
		int height=xyz.nextInt();
		
		
		ac.area(s);
		ac.area(l,b);
		ac.area(base,height,1);
	}
}
