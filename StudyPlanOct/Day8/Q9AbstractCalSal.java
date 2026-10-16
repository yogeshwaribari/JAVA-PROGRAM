/*9. Write a Java program to demonstrate Abstraction using an abstract class Employee with an
 abstract method calculateSalary(), and implement it in a Developer class.*/
 
 abstract class Employee
 {
	 abstract void calculateSalary();
 }
 class Developer extends Employee
 {
	public void calculateSalary()
	 {
		 int sal=30000;
		 System.out.println("salary = "+sal);
	 }
 }
class Q9AbstractCalSal
{
	public static void main(String x[])
	{
		Developer d=new Developer();
		d.calculateSalary();
	}
}