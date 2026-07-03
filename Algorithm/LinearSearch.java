import java.util.*;
public class LinearSearch
{
   public static void main(String x[])
   {
       Scanner xyz = new Scanner(System.in);
	   int arr[]=new int[10];
	   System.out.println("Enter values in array");
	   for(int i=0; i<arr.length; i++)
	   {
	      arr[i]=xyz.nextInt();
	   }
	   System.out.println("Enter search key");
	   int skey=xyz.nextInt();
	   int index=-1;
	   for(int i=0; i<arr.length; i++)
	   {
	       if(arr[i]==skey)
		   { index=i;
		      break;
		   } 
	   }
	   if(index!=-1)
	   { System.out.println("Data found");
	   }
	   else
	   { System.out.println("Data not found");
	   }
   }
}
