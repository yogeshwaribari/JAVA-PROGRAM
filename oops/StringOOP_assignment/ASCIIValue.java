/*22. Find ASCII Value
Class Name: ASCIIValue
Methods:
void setCharacter(char ch)
int getASCII()
Example
Input:
 'A'
Output:
 65
*/
import java.util.*;
class ASCIIValue
{
	char ch;
	
	void setCharacter(char ch)
	{
		this.ch=ch;
	}
	int getASCII()
	{
		int ascii=ch;
	
	return ascii;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		ASCIIValue a=new ASCIIValue();
		System.out.println("Enter Character");
		char c=xyz.next().charAt(0);
		a.setCharacter(c);
		int result=a.getASCII();
		System.out.println("Output :"+result);
	}
	
}