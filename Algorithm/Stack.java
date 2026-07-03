import java.util.*;
public class Stack
{
    public static void main(String x[])
	{int s[]=new int[5];
	  int top=-1;
	  do{
	   Scanner xyz  = new Scanner(System.in);
	   System.out.println("1:PUSH");
	   System.out.println("2:POP");
	   System.out.println("3:DISPLAY");
	   System.out.println("enter your choice");
	   int choice=xyz.nextInt();
	   switch(choice)
	   {
	      case 1:
		   if(top==(s.length-1))
		   {  System.out.println("Stack is overflow");
		   }
		   else{
		     top=top+1;
			 System.out.println("Enter data in stack");
			 int value=xyz.nextInt();
			 s[top]=value;
		   }
		  break;
		  case 2:
		  if(top==-1)
		  { System.out.println("Stack is underflow");
		  }
		  else{
		    int value=s[top];
			System.out.println("Deleted value is "+value);
			top=top-1;
		  }
		  break;
		  case 3:
		  if(top==-1)
		  { System.out.println("Stack is underflow");
		  }
		  else{
		      for(int i=top; i>=0; i--)
			  { System.out.printf("%d\n",s[i]);
			  }
		  }
		  break;
		  case 4:
		   System.exit(0);
		  default:
		   System.out.println("Wrong choice");
	   }
	  
	  }while(true);//infinite time 
	}
}
