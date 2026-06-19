/*Question 15: Write a Java program to create a Product inventory and update product price.

Description: Create Product class with id, name and price. Store products using constructor. 
Accept product id and new price and update it.
INPUT:
Products:
1 Mouse 500
2 Keyboard 800
3 Monitor 9000

Enter Product Id to update: 2
Enter new price: 1000

OUTPUT:
Updated Product:Keyboard
Price: 1000

EXPLANATION:
Create Product class with fields id, name, price. Store 3 products in array using constructor. 
Accept product id to update. Search product by id in array. Update price of matching product. 
Display updated product name and new price.*/
import java.util.*;
class Product{
	int id;
	String name;
	int price;
	
	Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display(int up)
	{
		System.out.println("Updated Product:"+name);
		System.out.println("Price:"+up);
	}
}
class constupdateProduct{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Product p[]=new Product[3];
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter Id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter name");
			String name=xyz.nextLine();
			System.out.println("Enter Price");
			int price=xyz.nextInt();
			
			p[i]=new Product(id,name,price);
		}
		System.out.println("Enter Product Id to update:");
		int uid=xyz.nextInt();
		for(int i=0;i<p.length;i++)
		{
			if(p[i].id==uid)
			{
				System.out.println("Enter new price:");
				int up=xyz.nextInt();
				
				p[i].price=up;
				p[i].display(up);
			}
			
		}
		
	}
}
