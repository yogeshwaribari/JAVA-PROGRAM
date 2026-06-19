/*character index print*/
class StringCharIndex
{
	public static void main(String x[])
	{
		String s="good";
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			char ch =s.charAt(i);
			System.out.println(i+"--->"+ch);
		}
	}
}
