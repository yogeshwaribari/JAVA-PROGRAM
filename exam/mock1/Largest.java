class Largest
{
	public static void main(String x[])
	{
	int i = Integer.parseInt(x[0]);
	float f = Float.parseFloat(x[1]);
	String msg = ((i>f) ? "Largest Number" : "Smaller Number");
	System.out.println(msg);
	}
	}
