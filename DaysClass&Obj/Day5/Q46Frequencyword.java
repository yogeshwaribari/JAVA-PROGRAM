/*46. Count the frequency of each word in a sentence.*/
import java.util.*;
class Q46Frequencyword
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String arr[]=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<i;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					flag=true;
					break;
				}
			}
			if(flag)
			{
				continue;
			}
			int cnt=0;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					cnt++;
				}
			}
			System.out.println(arr[i]+ "=" +cnt);
		}
	}
}