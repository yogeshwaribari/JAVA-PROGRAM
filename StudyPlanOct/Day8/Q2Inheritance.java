/*2. Write a Java program to demonstrate Inheritance using the extends keyword.
 Create a Parent class with a method display() and a Child class that inherits and calls the 
 method. */
 class Animal
 {
	 void display()
	 {
		 System.out.println("Show Animals");
	 }
 }
 class Dog extends Animal
 {
	
 }

class Q2Inheritance
{
	public static void main(String x[])
	{
		Dog d=new Dog();
		d.display();
	}
}