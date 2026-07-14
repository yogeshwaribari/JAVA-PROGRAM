/*47. Sort characters in a string alphabetically.*/
import java.util.*;
class Q47SortAlphabet
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		char arr[]=s.toCharArray();
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			str+=arr[i];
		}
		System.out.println("Sorted String :"+str);
	}
}