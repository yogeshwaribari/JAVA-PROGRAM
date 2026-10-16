/*1. Write a Java program to demonstrate Encapsulation by creating a Student class with 
private data members name and age, and public getter and setter methods. */
import java.util.*;
class Student
{
	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}
class Q1Encapsulation
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter Student name");
		s.setName(xyz.next());
		System.out.println("Enter Student Age");
		s.setAge(xyz.nextInt());
		
		System.out.println("Name "+s.getName());
		System.out.println("Age "+s.getAge());
	}
}