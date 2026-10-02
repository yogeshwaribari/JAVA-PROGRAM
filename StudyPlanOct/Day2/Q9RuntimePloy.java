/*9. Write a Java program to demonstrate runtime polymorphism using an `Animal` reference and a
 `Dog` object.  */
 import java.util.*;
 class Animal
 {
	 void sound()
	 {
		 System.out.println("Animal Sound");
	 }
 }
 class Dog extends Animal
 {
	 void sound()
	 {
		 System.out.println("Dog is barks");
	 }
 }
 class Q9RuntimePloy
 {
	 public static void main(String x[])
	 {
		 Animal a=new Dog();
		 a.sound();
	 }
 }
 