/*7. Write a Java program to demonstrate inheritance using `Animal` and `Dog` classes.*/
import java.util.*;
class Animal
{
	void sound()
	{
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal
{
	void dog()
	{
		System.out.println("Dog is Bark");
	}
}
class Q7Inheritance
{
	public static void main(String x[])
	{
		Dog d=new Dog();
		d.dog();
		//Animal a =new Dog(); upcasting
		//a.sound();
	}
}