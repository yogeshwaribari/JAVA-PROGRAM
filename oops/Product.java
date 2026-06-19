/*
Question 6: Write a Java program to implement a Product Discount System.
Create a class Product with attributes productId, name, and price.
Apply discount based on price:
- Price > 5000 => 20% Discount
- Price 2000 to 5000 => 10% Discount
- Price < 2000 => No Discount
Display the final price after discount.
Input:
Enter Product Id : 101
Enter Product Name : Headphones
Enter Price : 6000

Output:
Product Id : 101
Product Name : Headphones
Original Price : 6000
Discount : 20%
Final Price : 4800

Explanation:
A class Product is created with productId, name, and price.
The discount logic:
- price > 5000 => 20% discount => Final Price = price - (price * 20 / 100)
- price >= 2000 && price <= 5000 => 10% discount
- price < 2000 => No discount
Since price = 6000 (greater than 5000):
Discount = 6000 * 20 / 100 = 1200
Final Price = 6000 - 1200 = 4800
This program teaches percentage calculation and conditional discounting.*/
import java.util.*;
class Product{
	int productId;
	String name;
	int price;
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Product Id");
		productId=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter product name");
		name=xyz.nextLine();
		
		System.out.println("Enter Price");
		price=xyz.nextInt();
	}
	
	void getData()
	{
		System.out.println("Product Id ="+productId);
		System.out.println("Product name ="+name);
		System.out.println("Product price ="+price);
		int discount;
		int finalpri;
		
		if(price>5000)
		{
			System.out.println("Discount = 20%");
			 discount=(price*20)/100;
			 finalpri=price-discount;
			 System.out.println("Final Price ="+finalpri);
		}
		else if(price>=2000 && price<=5000)
		{
			System.out.println("Discount = 10%");
			discount=(price*10)/100;
			finalpri=price-discount;
			 System.out.println("Final Price ="+finalpri);
		}
		else if(price<2000)
		{
			System.out.println("No Discount");
		}
	}
	public static void main(String x[])
	{
		Product pro=new Product();
		pro.putData();
		pro.getData();
	}

}