/*
Question 53: Create a Java program to simulate a simple calculator using a switch case.
It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding 
operation.
Input:
Number1 = 10
Number2 = 5
Operator = +

Output:
Result = 15

Explanation:
The program uses switch on the operator. When '+' is selected, it performs addition of the two numbers.

Input:
Number1 = 10
Number2 = 4
Operator = %

Output:
Result = 2

Explanation:
The '%' operator calculates the remainder after division. 10 % 4 gives remainder 2.
*/
import java.util.Scanner;
class CalculatorSwitch
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int n1 = xyz.nextInt();
		int n2 = xyz.nextInt();
		System.out.println("Enter a operator (+, -, *, /, %)");
		char op = xyz.next().charAt(0);
		int result=0;
		switch(op)
		{
			case '+' : result = n1+n2;
			break;
			case '-': result = n1-n2;
			break;
			case '*': result = n1*n2;
			break;
			case'/': result = n1/n2;
			break;
			case '%': result = n1%n2;
			break;
			default : System.out.println("Invalid operator");
			break;
		}
		System.out.println("result = " +result);
	}
	
		
}