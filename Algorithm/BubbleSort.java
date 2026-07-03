import java.util.*;
public class BubbleSort
{
   public static void main(String x[])
   {
      Scanner xyz  = new Scanner(System.in);
	  int arr[]=new int[5];
	  System.out.println("Enter values in array");
	  for(int i=0; i<arr.length; i++)
	  {
	      arr[i]=xyz.nextInt();
	  }
	  System.out.println("\nArray before sorting\n");
	  for(int i=0; i<arr.length; i++)
	  { System.out.printf("%d\t",arr[i]);
	  }
	  //apply sorting logics 
	  for(int i=0; i<(arr.length-1); i++)
	  {  
                      for(int j=0; j<(arr.length-i-1);j++)
		  {
			   if(arr[j]>arr[j+1])
			   {
				    int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			   }
		  }
	  }
	   System.out.println("\nArray After Sorting\n");
	  for(int i=0; i<arr.length; i++)
	  { System.out.printf("%d\t",arr[i]);
	  }
   }
}
