/*2. Write a Java program that demonstrates string immutability and the difference between 
string constant pool references and heap allocations (== vs .equals()).*/

class Q2StringEquals
{
	public static void main(String x[])
	{
		String str="java";
		String str1="java";
		String str3=new String("java");
		String str4=new String("java");
		
		System.out.println("str==str1 " +(str==str1));
		System.out.println("str.equals(str1) " +(str.equals(str1)));
		
		System.out.println("str1==str3 " +(str1==str3));
		System.out.println("str1.equals(str3) " +(str1.equals(str3)));
		
		System.out.println("str3==str4 " +(str3==str4));
		System.out.println("str3.equals(str4) " +(str3.equals(str4)));
		
		str=str.concat(" programming");
		System.out.println("str "+str);
		System.out.println("str1 "+str1);
	}
}