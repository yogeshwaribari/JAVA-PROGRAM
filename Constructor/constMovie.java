/*Question 12: Write a Java program to create a Movie class and count how many movies have 
rating greater than 4.

Description: Create Movie class with movieId, movieName and rating. Initialize using constructor. 
Store movie objects and count movies having rating above 4.
INPUT:
Enter 4 Movies:
1 Leo 4.5
2 Jawan 3.8
3 Pathan 4.2
4 Tiger 3.5

OUTPUT:
Movies with rating above 4: 2

EXPLANATION:
Create Movie class with fields movieId, movieName, rating. Use constructor to initialize.
 Create Movie[] array to store movies. Loop through array, check if rating > 4.0 and increment counter.
 Display count of movies with rating > 4.*/
 import java.util.*;
 class Movie
 {
	 int movieId;
	 String movieName;
	 float rating;
	 
	 Movie(int movieId,String movieName,float rating)
	 {
		 this.movieId=movieId;
		 this.movieName=movieName;
		 this.rating=rating;
	 }
	 void display(int cnt)
	 {
		 
		 System.out.println("Movies with rating above 4:"+cnt);
	 }
 }
 class constMovie
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 Movie m[]=new Movie[4];
		 for(int i=0;i<m.length;i++)
		 {
			 System.out.println("Enter movie Id");
			 int movieId=xyz.nextInt();
			 xyz.nextLine();
			 System.out.println("Enter Movie Name");
			 String movieName=xyz.nextLine();
			 System.out.println("Enter rating");
			 float rating=xyz.nextFloat();
			 m[i]=new Movie(movieId,movieName,rating);
		 }
		 int cnt=0;
		 for(int i=0;i<m.length;i++)
		 {
			 if(m[i].rating>4)
			 {
				 cnt++;
			 }
		 }
		 m[0].display(cnt);
	 }
 }