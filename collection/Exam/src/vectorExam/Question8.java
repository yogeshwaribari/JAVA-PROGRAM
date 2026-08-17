/*Q8. Given an ArrayList<String>, reverse every individual string using only while loops. Do not use StringBuilder.reverse() or any
 *  built-in reverse method.
Explanation: Traverse the ArrayList using one while loop. For each string, start from its last character and move toward the first
 character using another while loop.
Input:
["Java", "Python", "SQL", "Developer", "Data"]
Output:
[avaJ, nohtyP, LQS, repoleveD, ataD]*/
package vectorExam;
import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		System.out.println("Enter number of words");
		int n=xyz.nextInt();
		System.out.println("Enter words");
		for(int i=0;i<=n;i++)
		{
			String s=xyz.nextLine();
			al.add(s);
		}
		
		ArrayList<String> re=new ArrayList<>();
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			String rev="";
			String str=i.next();
			for(int j=str.length()-1;j>=0;j--)
			{
				char ch=str.charAt(j);
				rev=rev+str.charAt(j);
			}
			re.add(rev);
		}

		System.out.println(re);
		

	}

}
