/*Q14. Write a java program to print this pattern.      
*******     
******      
*****      
****      
***      
**      
*    
**    
***      
****      
*****      
******      
*******			*/
class Q14pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=13;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i+j<=8 ||i-j>=6)
				System.out.print(" *");
			}
			
			 System.out.println();
		 }
	}
}