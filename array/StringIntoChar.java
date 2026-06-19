/*String convert into char array*/
class StringIntoChar
{
	public static void main(String x[])
	{
		String s = "good";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print("\t"+ch[i]);
		}
	}
}
