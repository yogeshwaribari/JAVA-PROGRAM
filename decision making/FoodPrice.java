/*
Question 61: Create a Java program to simulate a basic food ordering system using switch:
1: Burger
2: Pizza
3: Pasta
4: Sandwich
Display the price for the selected item.
Input:
Choice = 1

Output:
Burger - ?120

Explanation:
Case 1 represents Burger and prints its price.

Input:
Choice = 5

Output:
Invalid Selection

Explanation:
Since 5 is not in menu, default case executes.
*/
import java.util.Scanner;
class FoodPrice
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1: Burger \n2: Pizza \n3: Pasta \n4: Sandwich \nEnter your choice");
		int c = xyz.nextInt();
		switch(c)
		{
			case 1 : System.out.println("Burger - Rs120");
			break;
			case 2 : System.out.println("Pizza - Rs149");
			break;
			case 3 : System.out.println("Pasta - Rs100");
			break;
			case 4 : System.out.println("Sandwich - Rs89");
			break;
			default : System.out.println("Invalid Selection");
		}
	}
}
