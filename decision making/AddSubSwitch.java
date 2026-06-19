/*
Question 62: Write a menu-driven program in java using switch case.
          1.Addition
          2.Subtraction
          3.Multiplication
          4,Division
Input:
Choice = 3
Number1 = 6
Number2 = 4

Output
Multiplication = 24

Explanation:
Choice 3 performs multiplication of two numbers
*/
import java.util.Scanner;
class AddSubSwitch
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println(" 1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \nEnter Your Choice");
		int c = xyz.nextInt();
		System.out.println("Enter two numbers");
		int n1 = xyz.nextInt();
		int n2 = xyz.nextInt();
		switch(c)
		{
			case 1 : 
			System.out.println("Addition = " +(n1+n2));
			break;
			case 2 : 
			System.out.println("Subtraction = " +(n1-n2));
			break;
			case 3 :
			System.out.println("Multiplication = " +(n1*n2));
			break;
			case 4 :
			System.out.println("Division = " +(n1/n2));
			break;
			default : 
			System.out.println("Invalid Choice");
		}
	}
}
