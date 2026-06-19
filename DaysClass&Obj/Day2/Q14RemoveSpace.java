/*14. Remove all white spaces from a string.*/
import java.util.*;
class  Q14RemoveSpace
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				ns+=s.charAt(i);
			}
		}
		System.out.println("Remove Space :"+ns);
	}
}