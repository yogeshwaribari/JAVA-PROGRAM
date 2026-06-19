/*Question 4: Write a Java program to implement a Voting Eligibility Checker.
Create a class Person with attributes name and age.
Check whether the person is eligible for voting.
Condition: Age >= 18 => Eligible, Otherwise => Not Eligible.
Input:
Enter Name : Rohan
Enter Age : 16

Output:
Name : Rohan
Age : 16
Result : Not Eligible for Voting

Explanation:
A class Person is created with instance variables name and age.
An object is created and user inputs name and age using Scanner.
Condition: if (age >= 18) => Eligible for Voting, else => Not Eligible for Voting.
Since age = 16, which is less than 18, the result is Not Eligible for Voting.
If age were 18 or above (e.g., 20), the result would be Eligible for Voting.
This program demonstrates how class attributes are used with real-world conditional logic.*/
import java.util.*;
class Person{
	String name;
	int age;
	
	void showResult()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		if(age>=18)
		{
			System.out.println("Eligible for Voting");
		}
		else{
			System.out.println("Not Eligible for Voting");
		}
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Person p=new Person();
		System.out.println("Enter Name");
		p.name=xyz.nextLine();
		
		System.out.println("Enter Age");
		p.age=xyz.nextInt();
		
		p.showResult();
	}
}