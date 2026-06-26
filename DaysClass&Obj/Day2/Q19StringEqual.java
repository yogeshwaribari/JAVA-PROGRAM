/*19. Check whether two strings are equal.*/
import java.util.*;
class Q19StringEqual
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1=xyz.nextLine();
		System.out.println("Enter String 2");
		String s2=xyz.nextLine();
		if(s1.equals(s2))
		{
			System.out.println("String Equals");
		}
		else
		{
			System.out.println("Not Equals");
		}
	}
}