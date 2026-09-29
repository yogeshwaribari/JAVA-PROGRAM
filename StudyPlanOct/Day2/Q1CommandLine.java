/*1. Write a Java program that demonstrates the standard main method entry point and processes 
command-line arguments.*/
class Q1CommandLine
{
	public static void main(String x[])
	{
		int a=Integer.parseInt(x[0]);
		double b=Double.parseDouble(x[1]);
		float f=Float.parseFloat(x[2]);
		char c=x[3].charAt(0);
		
		System.out.println("Integer "+a);
		System.out.println("double "+b);
		System.out.println("Float "+f);
		System.out.println("char "+c);
		
	}
}