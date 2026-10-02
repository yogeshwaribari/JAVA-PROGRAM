/*8. Write a Java program to demonstrate method overriding using `Animal` and `Dog` classes. */ 
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
	void sound()
	{
		System.out.println("Dog is Bark");
	}
}
class Q8Overriding
{
	public static void main(String x[])
	{
		
		Dog d =new Dog(); 
		d.sound();
	}
}