/*52. Check whether one string is a rotation of another.*/
import java.util.*;
class Q52RotationString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter String 2");
		String s1=xyz.nextLine();
		
		boolean flag=false;
		if(s.length()==s1.length())
		{
			for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(0);
					String rem=s.substring(1);
					String rot=rem+ch;
					if(s.equals(s1))
					{
						flag=true;
						break;
					}
					s=rot;
				}
		}
		
		if(flag)
		{
		System.out.println("String is Rotation");
		}
		else
		{
			System.out.println("String is not Rotation");
		}
	}
}