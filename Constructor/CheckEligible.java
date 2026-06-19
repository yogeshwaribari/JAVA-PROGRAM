/*Question 23: Write a Java program to check eligible voters.

Description: Create Person class with name and age. Check age ?18 eligible otherwise not eligible.
INPUT:
Rahul 17
Amit 22
Neha 19

OUTPUT:
Eligible Voters:
Amit
Neha

EXPLANATION:
Create Person class with fields name and age. Use constructor to initialize. 
Store 3 persons in array. Loop through array, check if age >= 18. If true, person is eligible voter. 
Display names of eligible voters. Amit (22 >= 18) and Neha (19 >= 18) are eligible.*/
import java.util.*;
class Person
{
	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println(name);
	}
}
class CheckEligible
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Person p[]=new Person[3];
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter Name");
			String name=xyz.next();
			System.out.println("Enter age");
			int age=xyz.nextInt();
			p[i]=new Person(name,age);
		}
		
		System.out.println("Eligible Voters:");
		for(int i=0;i<p.length;i++)
		{
			if(p[i].age>=18)
			{
				p[i].display();
				
			}
		}
	}
}