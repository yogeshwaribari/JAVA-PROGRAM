package collection;
import java.util.*;
public class ArrayListDisplayProduct {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Product("Mouse", 1, 1000));
		al.add(new Product("Keyboard", 2, 1000));
		al.add(new Product("Laptop", 3, 100000));
		al.add(new Product("Remote", 4, 1000));
		System.out.println("Display product list");
		for (Object obj : al) {
			Product p = (Product) obj;
	System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice());
		}

	}
}
