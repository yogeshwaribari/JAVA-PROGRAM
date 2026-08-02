/*Question 57: Create abstract class Bonus
Asked In Practice Question
Abstract method calculateBonus().
Subclasses:

Manager

Developer

Input
Salary: 50000
Bonus %: 10
Output
Bonus: 5000*/
import java.util.*;
abstract class Bonus
{
	int salary;
	int bonus;
	Bonus(int salary,int bonus)
	{
		this.salary=salary;
		this.bonus=bonus;
	}
	abstract void calculateBonus();
}
class Manager extends Bonus
{
	Manager(int salary,int bonus)
	{
		super(salary,bonus);
	}
	void calculateBonus()
	{
		System.out.println("Bonus :"+(salary*bonus/100));
	}
}
class Developer extends Bonus
{
	Developer(int salary,int bonus)
	{
		super(salary,bonus);
	}
	void calculateBonus()
	{
		System.out.println("Bonus :"+(salary*bonus/100));
	}
}
class Q57Bonus
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1. Manager \n 2.Developer");
		int choice=xyz.nextInt();
		Bonus b;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Salary");
			int salary=xyz.nextInt();
			System.out.println("Enter Bonus");
			int bonus=xyz.nextInt();
			b=new Manager(salary,bonus);
			b.calculateBonus();
			break;
			case 2:
			System.out.println("Enter Salary");
			 salary=xyz.nextInt();
			System.out.println("Enter Bonus");
			 bonus=xyz.nextInt();
			b=new Developer(salary,bonus);
			b.calculateBonus();
			break;
			default :
			System.out.println("Wrong choice");
		}
	}
}