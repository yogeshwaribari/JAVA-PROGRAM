/*byte offset length*/
class StringByteLength
{
	public static void main(String x[])
	{
		byte b[]=new byte[]{97,98,99,100,101,102,103};
		String s=new String(b,2,5);
		System.out.println(s);
	}
}