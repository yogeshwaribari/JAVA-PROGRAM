/*Question 4: Write a Java program to create a Product class and check whether product price is 
expensive or affordable.

Description: Create Product POJO class with productId, productName and price.
 Use constructor to initialize values. If price > 1000 print Expensive otherwise Affordable.
INPUT:
Enter Product Id: 501
Enter Product Name: Headphones
Enter Price: 1200

OUTPUT:
Product Name: Headphones
Category: Expensive Product

EXPLANATION:
Create Product class with fields productId, productName, price. Use constructor public Product
(int id, String name, int p) to initialize. In constructor or display method, check if price > 1000 
then print "Expensive Product" else "Affordable Product". Display product name and category.*/
import java.util.*;
class Product
{
	private int id;
	private String name;
	private int p;
	
	Product(int id,String name,int p)
	{
		this.id=id;
		this.name=name;
		this.p=p;
	}
	void display()
	{
		System.out.println("Product Name :"+name);
		if(p>=1000)
		{
			System.out.println("Category : Expensive Product");
		}
		else{
			System.out.println("Category : Affordable Product");
		}
	}
	
}
class constProduct
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter product id");
		int id=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Product Name");
		String name=xyz.nextLine();
		System.out.println("Enter price");
		int p=xyz.nextInt();
		Product pro=new Product(id,name,p);
		pro.display();
	}
}