/*7. Write a Java program to demonstrate Multiple Inheritance using Interfaces.
Create two interfaces Printable and Showable and implement both in a single class. */

interface Printable
{
	void print();
}
interface Showable
{
	void show();
}
class Multiple implements Printable,Showable
{
	public void print()
	{
		System.out.println("Print program");
	}
	public void show()
	{
		System.out.println("Show Program");
	}
}

class Q7MultipleInheri
{
	public static void main(String x[])
	{
		Multiple m =new Multiple();
		m.print();
		m.show();
	}
}