/*16. Find the ASCII value of each character.*/
import java.util.*;
class Q16ASCII
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Character");
		char ch=xyz.next().charAt(0);
		
		int ascii=ch;
		System.out.println("Ascii Value :"+ascii);
	}
}