/*Question 4: Write a Java program to count total words in a file.
Asked In Practice Assignment
Input:
File content:
Java is easy language

Output:
Total words = 4

Explanation:
Read entire file content as string using BufferedReader and StringBuilder. 
Split string using space delimiter with split method. Count number of elements in resulting 
string array which represents total words. Handle multiple consecutive spaces correctly using 
regex pattern. Alternatively use StringTokenizer to count words. Display total word count.*/
import java.io.*;
class Q4CountWords
{
	public static void main(String x[]) throws IOException
	{
		File f=new File("student.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String data;
		int cnt=0;
		while((data=br.readLine())!=null)
		{
			String str[]=data.split(" ");
			cnt=cnt+str.length;
			
		}
		br.close();
		System.out.println("Total Words :"+cnt);
	}
}