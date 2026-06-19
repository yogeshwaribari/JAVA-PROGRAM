/*Question 32: Write a Java program to implement a Triangle Validator using POJO class.
Create a POJO class Triangle with variables side1, side2, and side3.
Determine the triangle type:
- All sides equal => Equilateral
- Two sides equal => Isosceles
- All sides different => Scalene
Input:
Enter Side1 : 5
Enter Side2 : 5
Enter Side3 : 8

Output:
Triangle Type : Isosceles

Explanation:
A POJO class Triangle has private fields: side1, side2, side3.
Setters accept user input. Getters are used in the type-checking logic.
Conditions:
- if (side1 == side2 && side2 == side3) => Equilateral
- else if (side1 == side2 || side2 == side3 || side1 == side3) => Isosceles
- else => Scalene
Since side1 = 5 and side2 = 5 (two sides equal), the type is Isosceles.
side3 = 8 is different from side1 and side2.
This shows conditional logic applied to POJO class data.*/
import java.util.*;
class Triangle{
	private int side1;
	private int side2;
	private int side3;
	
	public void setSide1(int side1)
	{
		this.side1=side1;
	}
	public int getSide1()
	{
		return side1;
	}
	public void setSide2(int side2)
	{
		this.side2=side2;
	}
	public int getSide2()
	{
		return side2;
	}
	public void setSide3(int side3)
	{
		this.side3=side3;
	}
	public int getSide3()
	{
		return side3;
	}
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Side1");
		setSide1(xyz.nextInt());
		System.out.println("Enter Side2");
		setSide2(xyz.nextInt());
		System.out.println("Enter Side3");
		setSide3(xyz.nextInt());
	}
	void checktriangle()
	{
		if(getSide1()==getSide2() && getSide2()==getSide3())
		{
			System.out.println("Triangle Type : Equilateral");
		}
		else if(getSide1()==getSide2() || getSide2()==getSide3() || getSide1()==getSide3())
		{
			System.out.println("Triangle Type : Isosceles");
		}
		else{
		System.out.println("Triangle Type : Scalene");

		}
	}
}
class Q32POJOTriangle{
	public static void main(String x[])
	{
		Triangle t=new Triangle();
		t.putData();
		t.checktriangle();
	}
}