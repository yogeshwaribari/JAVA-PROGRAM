/*
Question 3: Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus.
Input:
Number1 = 20
Number2 = 5

Output:
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4
Modulus = 0
*/

class Operater
{
    public static void main (String  x[])
	{
		int num1 = Integer.parseInt(x[0]);
		int num2 = Integer.parseInt(x[1]);
		
		System.out.println("Addition = " + (num1+num2));
		System.out.println("Subtraction = " + (num1-num2));
		System.out.println("Multiplication =" + (num1*num2));
		System.out.println("Division = " + (num1/num2));
		System.out.println("Modulus = " + (num1%num2));
		
		
	}

}