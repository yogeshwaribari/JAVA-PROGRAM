/*6. Write a Java program to demonstrate Method Overriding where a child class provides 
its own implementation of a method defined in the parent class. */

class Animal
{
	void sound()
	{
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog is barks");
	}
}
class Q6methodOverriding
{
	public static void main(String x[])
	{
		Dog d=new Dog();
		d.sound();
	}
}