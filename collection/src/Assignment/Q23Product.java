/*Q23.Problem Statement
Develop a Product Inventory program using Vector and POJO class to perform inventory related operations.
Description
Product fields:
● int productId
● String productName
● int quantity
● double price
Operations
1. Add products
2. Display products
3. Search product by name
4. Calculate total inventory value
5. Display out of stock products
Input
Enter number of products:
3
Enter product details:
1 Mouse 10 500
2 Keyboard 0 800
3 Monitor 5 7000
Search product:
Mouse
Output
Product List:
1 Mouse 10 500
2 Keyboard 0 800
3 Monitor 5 7000
Product Found:
Mouse
Total Inventory Value:
40000
Out of stock:
Keyboard*/
package Assignment;
import java.util.*;
class ProductData
{
	private int proId;
	private String proName;
	private int quantity;
	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private double price;
	
	ProductData(int proId,String proName,int quantity,double price)
	{
		this.proId=proId;
		this.proName=proName;
		this.quantity=quantity;
		this.price=price;
	}
}
public class Q23Product {

	public static void main(String[] args) {
		
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of products");
		int n=xyz.nextInt();
		Vector <ProductData> v =new Vector<ProductData>();
		
		do {
			System.out.println("1. Add products");
			System.out.println("2. Display products");
			System.out.println("3. Search product by name");
			System.out.println("4. Calculate total inventory value");
			System.out.println("5. Display out of stock products");
			System.out.println("Enter choice");
			int choice=xyz.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter product id");
				int proid=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Entar Name");
				String name=xyz.nextLine();
				System.out.println("Enter Quantity");
				int quantity=xyz.nextInt();
				System.out.println("Enter price");
				int price=xyz.nextInt();
				ProductData p=new ProductData(proid,name,quantity,price);
				v.add(p);
				System.out.println("Product Added");
				break;
				
			case 2:
				if(v.size()!=0)
				{
					for(ProductData p1:v)
					{
						System.out.println(p1.getProId()+"\t"+p1.getProName()+"\t"+p1.getQuantity()+"\t"+p1.getPrice());
					}
				}
				else
				{
					System.out.println("Product data not present collection");
				}
				break;
				
			case 3:
				xyz.nextLine();
				System.out.println("Search product name");
				String sname=xyz.nextLine();
				boolean flag=false;
				for(ProductData p2:v)
				{
					if(p2.getProName().equals(sname))
					{
			            System.out.println("Product Found:");
			            System.out.println(p2.getProName());

			            flag = true;
			            break;
			        }
			    }

			    if(!flag)
			    {
			        System.out.println("Product Not Found");
			    }

				break;
				
			case 4:
				
				double total=0;
				for(ProductData p3:v)
				{
					total+=p3.getQuantity()*p3.getPrice();
				}
				System.out.println("Total Inventory Value: "+total);
				break;
				
			case 5:
				System.out.println("Out of stock:");
				for(ProductData p4:v)
				{
					if(p4.getQuantity()==0)
					{
						System.out.println(p4.getProName());
					}
				}
				break;
				
				default :
					System.out.println("Wrong choice");
			}
			
			
			
		}while(true);

	}

}
