/*Q13.Create Product class:
 *  ● productId 
 *  ● productName 
 *  ● price Store
 *   products in Vector and display products with price less than 500. 
 * Description Check condition: 
 * price < 500 
 * Input
 *  P1 Mouse 450
 *   P2 Keyboard 700
 *    P3 PenDrive 350 
 *    P4 Monitor 9000 
 *    Output 
 *    Products below 500: 
 *     P1 Mouse 450
 *      P3 PenDrive 350 */
package Assignment;
import java.util.*;

class Product
{
	private int id;
	private String name;
	private int price;
	Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Q13Product {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of product");
		int n=xyz.nextInt();
		ArrayList<Product> al=new ArrayList<Product>();
		System.out.println("Enter Details");
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter Id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter name");
			String name=xyz.nextLine();
			System.out.println("Enter price");
			int price=xyz.nextInt();
			Product p=new Product(id,name,price);
			al.add(p);
		}
		System.out.println(" Products below 500:");
		for(Product pro:al)
		{
			if(pro.getPrice()<500)
			{
				System.out.println(pro.getId()+"\t"+pro.getName()+"\t"+pro.getPrice());
			}
			
		}
		
		

	}

}
