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
/*import java.util.*;

class StringEqual
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter First String");
        String s1 = xyz.nextLine();

        System.out.println("Enter Second String");
        String s2 = xyz.nextLine();

        boolean flag = true;

        if(s1.length() != s2.length())
        {
            flag = false;
        }
        else
        {
            for(int i=0; i<s1.length(); i++)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    flag = false;
                    break;
                }
            }
        }

        if(flag)
        {
            System.out.println("Strings are Equal");
        }
        else
        {
            System.out.println("Strings are Not Equal");
        }
    }
}*/