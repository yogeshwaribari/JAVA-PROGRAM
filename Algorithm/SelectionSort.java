import java.util.*;
public class SelectionSort
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
	  for(int i=0; i<arr.length; i++)
	  {
	      for(int j=(i+1); j<arr.length; j++)
		  {
		       if(arr[i]>arr[j])
			   {
			      int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			   }
		  }
	  }
	   System.out.println("\nArray After Sorting\n");
	  for(int i=0; i<arr.length; i++)
	  { System.out.printf("%d\t",arr[i]);
	  }
   }
}
