/*Q10. Write a java program to print this pattern.
    *  *  *  *  *  *  *  *  * 
	   *  *  *  *  *  *  *    
	      *  *  *  *  *  
	         *  *  *      
	            * 		*/
class Q10pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=0;j<=9;j++)
			{
				if(i-j<=0 && i+j<=10)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}