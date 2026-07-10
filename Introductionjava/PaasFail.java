/*
Take student marks and check pass or fail.
*/

import java.util.*;
class PassFail
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int a = xyz.nextInt();
		String msg = ((a>35) ? "Pass" : "Fail");
		System.out.println(msg);
	}
}