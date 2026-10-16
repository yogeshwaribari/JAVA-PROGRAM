/*10. Write a Java program to demonstrate the use of the super keyword. Create a parent class with 
a variable and method, and access both from the child class using super. */

class Teacher
{
	int id;
	String name;
	Teacher(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("ID "+id);
		System.out.println("Name "+name);
	}
}
class Student extends Teacher
{
	Student(int id,String name)
	{
		super(id,name);
	}
	void display()
	{
		super.display();
	}
}
class Q10SuperKey
{
	public static void main(String x[])
	{
		Student s=new Student(1,"Yogi");
		s.display();
	}
}