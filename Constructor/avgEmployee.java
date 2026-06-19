/*Question 18: Write a Java program to count how many employees salary is above average.

Description: Create Employee class with id, name and salary. Calculate average salary then
 count employees having salary greater than average.
INPUT:
1 Ram 20000
2 Shyam 30000
3 Mohan 25000
4 Sita 35000

OUTPUT:
Average Salary: 27500
Employees above average: 2

EXPLANATION:
Create Employee class with fields id, name, salary. Store 4 employees in array using constructor. 
Calculate average: sum all salaries / 4 = (20000+30000+25000+35000)/4 = 27500. Loop through array,
 count employees where salary > average. Display average and count.
*/
import java.util.*;
class Employee
{
	int id;
	String name;
	int salary;
	
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
class avgEmployee
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Employee e[]=new Employee[4];
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter Name");
			String name=xyz.nextLine();
			System.out.println("Enter Salary");
			int salary=xyz.nextInt();
			
			e[i]=new Employee(id,name,salary);
		}
		int avg=0;
		int sum=0;
		int cnt=0;
		for(int i=0;i<e.length;i++)
		{
			sum=e[i].salary+sum;
		}
		avg=sum/e.length;
		for(int i=0;i<e.length;i++)
		{
			if(e[i].salary>avg)
			{
				cnt++;
			}
		}
		System.out.println("Average Salary:" +avg);
		System.out.println("Employees above average:"+cnt);
	}
}