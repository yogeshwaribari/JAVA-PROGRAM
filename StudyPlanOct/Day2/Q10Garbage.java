/*10. Write a Java program that simulates garbage collection eligibility by nullifying object
 references and requesting garbage collection via System.gc(). */
 class Q10Garbage
 {
	 public static void main(String x[])
	 {
		 Q10Garbage g=new Q10Garbage();
		 g=null;
		 System.gc();
		 System.out.println("Garbage collection requested");
	 }
 }