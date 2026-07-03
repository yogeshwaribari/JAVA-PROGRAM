import java.util.*;
public class Queue
{
   public static void main(String x[])
   {   int q[]=new int[5];
       int rear=-1,front=0;
      Scanner xyz  = new Scanner(System.in);
	  do{
	    System.out.println("\n1:INSERT");
		System.out.println("2:DELETE");
		System.out.println("3:DISPLAY");
		System.out.println("4:Exit");
		System.out.println("Enter your choice");
		int choice=xyz.nextInt();
		switch(choice)
		{
		   case 1:
		   if(rear==(q.length-1))
		   { System.out.println("Queue is full");
		   }
		   else{
		   System.out.println("Enter data in queue");
		   int value=xyz.nextInt();
		     rear=rear+1;
			 q[rear]=value;
		   }
		   break;
		   case 2:
		   if((rear==-1 && front==0) ||(front==(rear+1)))
		   { System.out.println("Queue is empty");
		   }
		   else{
		     int value=q[front];
			 front=front+1;
			System.out.println("delete data from queue "+value);
		   }
		   break;
		   case 3:
		   if((rear==-1 && front==0) ||(front==(rear+1)))
		   { System.out.println("Queue is empty");
		   }
		   else{
		       for(int i=front; i<=rear; i++)
			   { System.out.printf("%d\t",q[i]);
			   }
		   }
		   break;
		   case 4:
		   System.exit(0);
		   break;
		   default:
		    System.out.println("Wrong choice");
		}
	  
	  }while(true);//infinite loop 
   }
}
