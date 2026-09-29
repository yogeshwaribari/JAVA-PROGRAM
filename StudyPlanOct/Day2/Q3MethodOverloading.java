/*3. Write a Java program to illustrate method overloading with multiple methods 
sharing the same name but different parameter lists. */
class Overloading
{
	 void display(int id)
	 {
		 System.out.println("Id:"+id);
	 }
	 void display(int id,String name)
	 {
		 System.out.println("ID:"+id+ "\nName:"+name);
	 }
	  void display(int id,String name,String course)
	 {
		 System.out.println("ID:"+id+ "\nName:"+name+ "\nCourse:"+course);
	 }
	 
}
class Q3MethodOverloading
{
	public static void main(String x[])
	{
			Overloading o=new Overloading();
			o.display(1);
			o.display(1,"Yogi");
			o.display(2,"Leena","Java");
	}
}