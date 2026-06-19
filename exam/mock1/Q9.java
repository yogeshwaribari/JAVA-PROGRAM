/*
Q9. Write a menu-driven program in java using switch case.
1. Check Number is positive , negative or zero.
2. Check Number is even or odd.
3. Find max number using 3 number
*/
import java.util.Scanner;
class Q9
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Check Position,Negative Number \n2.Check Even or Odd \n3.Find Max 3 Number");
		System.out.println("Enter your choice");
		int ch = xyz.nextInt();
		switch(ch)
		{
			case 1: //check positive negative number
				System.out.println("Enter a Number");
				int no = xyz.nextInt();
				if(no==0)
				{
					System.out.println("Zero");
				}
				else if(no>0)
				{
					System.out.println("Positive");
				}
				else{
					System.out.println("Negative");
				}
				break;
				
			case 2: //check even or odd
				System.out.println("Enter a Number");
				int eo = xyz.nextInt();
				if(eo%2==0)
				{
					System.out.println("Even");
				}
				else{
					System.out.println("Odd");
				}
				break;
				
			case 3: // check max number 
				System.out.println("Enter Three Number");
				int a = xyz.nextInt();
				int b = xyz.nextInt();
				int c = xyz.nextInt();
				if(a>b && a>c)
				{
					System.out.println("Max Number ="+a);
				}
				else if(b>c)
				{
					System.out.println("Max Number ="+b);
				}
				else
				{
					System.out.println("Max Number ="+c);
				}
				break;
				
			default : System.out.println("Invalid Choice"); 
			
		}
	}
	
}