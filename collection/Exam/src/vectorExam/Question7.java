/*Q7. Given an ArrayList<String>, find the longest string and shortest string without using Collections.sort()
 *  or any built-in sorting method. If multiple strings have the same length, display all of them.
Explanation: Maintain maxLength and minLength while traversing the list. Store all strings matching the maximum and minimum lengths.
Input: ["Java", "Python", "SQL", "Programming",
"AI", "Developer", "Data", "Analytics"]
Output:
Longest String: Programming
Shortest Strings: AI*/
package vectorExam;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	ArrayList <String> al=new ArrayList<>();
	System.out.println("Enter number of words");
	int n=xyz.nextInt();
	System.out.println("Enter words");
	for(int i=0;i<=n;i++)
	{
		String s=xyz.nextLine();
		al.add(s);
	}
	int maxlength=al.get(0).length();
	int minlength=al.get(0).length();
	
	Iterator i=al.iterator();
	while(i.hasNext())

	{
		String st=(String) i.next();
		
			if(st.length()>maxlength)
			{
				maxlength=st.length();
			}
			else if(st.length()<minlength)
			{
				minlength=st.length();
			}
		
	}
	System.out.println(al.get(minlength));
	System.out.println(al.get(maxlength));
	
	}

}
