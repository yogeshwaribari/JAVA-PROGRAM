/*48. Sort words in a sentence alphabetically.*/
import java.util.*;
class Q48Sortword
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String arr[]=s.split(" ");
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			str+=arr[i]+" ";
		}
		System.out.println(str);
	}
}