/*Question 5: Write a Java program to create a Rectangle class and calculate area using constructor.

Description: Create Rectangle class with length and width. Initialize values using constructor and 
calculate area using formula length × width.
INPUT:
Enter Length: 10
Enter Width: 5

OUTPUT:
Area of Rectangle is: 50

EXPLANATION:
Create Rectangle class with fields length and width. Use constructor public Rectangle
(int length, int width) to initialize values. Calculate area as length * width. Create method to
 display area. Create object new Rectangle(10, 5) and display area.*/
 import java.util.*;
 class Rectangle
 {	private int length;
	private int width;
	
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	void display()
	{
		System.out.println("Area of Rectangle is:"+(length*width));
	}
 }
 class constRectangle
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter length");
		 int length=xyz.nextInt();
		 System.out.println("Enter width");
		 int width=xyz.nextInt();
		 
		 Rectangle r=new Rectangle(length,width);
		 r.display();
	 }
 }
 
 