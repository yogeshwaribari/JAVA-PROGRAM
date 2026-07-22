/*74. Implement your own version of `String.substring()`.*/
import java.util.*;
class Q74WithoutSubString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		System.out.println("Enter Start index");
		int start=xyz.nextInt();
		System.out.println("Enter End index");
		int end=xyz.nextInt();
		String res="";
		for(int i=start;i<end;i++)
		{
			res=res+s.charAt(i);
		}
		System.out.println("SubString :"+res);
	}
}