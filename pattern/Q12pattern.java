/*Q12. Write a java program to print this pattern. 
  # # # # # 
  * * * * 
  # # # 
  * * 
  # 				*/
  class Q12pattern
  {
	  public static void main(String x[])
	  {
		  for(int i=1;i<=5;i++)
		  {
			  for(int j=1;j<=5;j++)
			  {
				  if(i%2==0 && i+j<=6)
				  {
					  System.out.print(" *");
				  }
				  else if(i+j<=6)
				  {
					  System.out.print(" #");
				  }
			  }
			  System.out.println();
		  }
	  }
  }