/*
Question 36: Check if a person is a child, teenager, adult, or senior based on age.

   Input: Age
   Logic: if-else if
   Output: Age category.
Input:
Age = 16

Output
Teenager

Explanation:
Age < 13 ? Child
13–19 ? Teenager
20–59 ? Adult
60+ ? Senior
*/
import java.util.Scanner;
class CheckAge
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Age");
		int age = xyz.nextInt();
		if(age<13)
		{
			System.out.println("Child");
		}
		else if(age >=13 && age<=19)
		{
			System.out.println("Teenager");
		}
		else if(age >=20 && age<=59)
		{
			System.out.println("Adult");
		}
		else{
			System.out.println("Senior");
		}
	}
}