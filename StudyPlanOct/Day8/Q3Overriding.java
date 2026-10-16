/*3. Write a Java program to demonstrate Method Overriding and Runtime Polymorphism using a 
parent class Animal and child classes Dog and Cat. */
class Animal
{
	void show()
	{
		System.out.println("Show Animal");
	}
}
class Dog extends Animal
{
	void show()
	{
		System.out.println("I am Dog");
	}
}
class Cat extends Animal
{
	void show()
	{
		System.out.println("I am cat");
	}
}

class Q3Overriding
{
	public static void main(String x[])
	{
		Animal a = new Dog();
		a.show();
		Animal a1 =new Cat();
		a1.show();
	}
}