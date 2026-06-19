/*Question 20: Write a Java program to check palindrome names using constructor objects.

Description: Create NameCheck class storing a name using constructor. Store multiple names and check 
which names are palindrome.
INPUT:
Enter names:
NITIN
AMIT
MADAM
RAHUL

OUTPUT:
Palindrome Names:
NITIN
MADAM

EXPLANATION:
Create NameCheck class with String name field. Use constructor to initialize. Store names in array.
 For each name, check if palindrome: reverse string and compare with original. If equal then palindrome.
 Display all palindrome names. NITIN reversed = NITIN (palindrome), MADAM reversed = MADAM (palindrome).
*/
import java.util.*;
class NameCheck{
	String name;
	
	NameCheck(String name)
	{
		this.name=name;
	}
}
class PalindromeCheck
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		NameCheck n[]=new NameCheck[4];
		System.out.println("Enter String");
		for(int i=0;i<n.length;i++)
		{
			String nam=xyz.nextLine();
			n[i]=new NameCheck(nam);
		}
		System.out.println("Palindrome Names:");
		for(int i=0;i<n.length;i++)
		{
		String rev="";
		for(int j=n[i].name.length()-1;j>=0;j--)
		{
			rev+=n[i].name.charAt(j);
		}
		if(n[i].name.equals(rev))
		{
			System.out.println(n[i].name);
		}
		}
		
	}
}