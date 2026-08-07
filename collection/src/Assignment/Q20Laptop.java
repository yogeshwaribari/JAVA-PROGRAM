/*Q20.Create Laptop class:
● id
● brand
● price
Store laptops in Vector and display laptops of brand Dell.
Description
Logical condition:
brand.equals("Dell")
Input
1 Dell 55000
2 HP 60000
3 Dell 72000
4 Lenovo 50000
Output
Dell Laptops:
1 Dell 55000
3 Dell 72000*/
package Assignment;
import java.util.*;
class Laptop{
	private int id;
	private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
	Laptop(int id,String brand,int price)
	{
		this.id=id;
		this.brand=brand;
		this.price=price;
	}
}
public class Q20Laptop {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of laptops");
		int n=xyz.nextInt();
		Vector <Laptop> v=new Vector<Laptop>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter brand");
			String brand=xyz.nextLine();	
			System.out.println("Enter price");
			int price=xyz.nextInt();
			Laptop l=new Laptop(id,brand,price);
			v.add(l);
		}
		System.out.println("Dell Laptops:");
		for(Laptop l:v)
		{
			if(l.getBrand().equals("Dell")) {
				System.out.println(l.getId()+"\t"+l.getBrand()+"\t"+l.getPrice());
			}
		}
		
	}

}
