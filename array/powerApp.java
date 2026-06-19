/*power functiom*/
import java.util.*;
class powerApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter base and index");
		int base=xyz.nextInt();
		int in=xyz.nextInt();
		power(base,in);
	}
	public static void power(int base,int in)
	{
		/*int p=1;
		for(int i=0;i<in;i++)
		 p=p*base;*/
		double po=Math.pow(base,in);
		System.out.println("power is "+po);
	}
}