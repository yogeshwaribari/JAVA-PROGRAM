/*Question 8: Write a Java program to create a Car class and display car details using constructor.

Description: Create Car POJO class with carId, carName and price. Initialize values using 
constructor and display car information.
INPUT:
Enter Car Id: 301
Enter Car Name: Swift
Enter Price: 650000

OUTPUT:
Car Details:
Id: 301
Name: Swift
Price: 650000

EXPLANATION:
Create Car class with fields carId, carName, price. Use constructor public Car
(int id, String name, int price) to initialize. Create display() method to show all details. 
Create object new Car(301, "Swift", 650000) and call display().
*/
import java.util.*;
class Car
{ 	private int carId;
	private String carname;
	private int price;
	
	Car(int carId,String carname,int price)
	{   
		this.carId=carId;
		this.carname=carname;
		this.price=price;
	}
	void display()
	{
		System.out.println("Car Details :");
		System.out.println("Id : "+carId);
		System.out.println("Name : "+carname);
		System.out.println("Price : "+price);
		
	}
}
class constCar
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Car Id");
		int carId=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Car Name");
		String carname=xyz.nextLine();
		System.out.println("Enter price");
		int price=xyz.nextInt();
		Car c=new Car(carId,carname,price);
		c.display();
	}
}