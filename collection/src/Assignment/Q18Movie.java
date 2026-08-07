/*Q18.Create Movie class:
● movieId
● movieName
● rating
Store movies in Vector and display movies having rating above 4.
Description
Condition:
rating > 4
Input
1 Pushpa 4.5
2 Leo 3.8
3 KGF 4.7
4 Jawan 4.2

Output
Top Rated Movies:
Pushpa
KGF
Jawan*/
package Assignment;
import java.util.*;
class Movie{
	private int moviId;
	private String movieName;
	Movie(){
		
	}
	Movie(int moviId,String movieName,double rating)
	{
		this.moviId=moviId;
		this.movieName=movieName;
		this.rating=rating;
	}
	public int getMoviId() {
		return moviId;
	}
	public void setMoviId(int moviId) {
		this.moviId = moviId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	private double rating;
}
public class Q18Movie {

	public static void main(String[] args) {
		
		Scanner xyz=new Scanner(System.in);
		Vector  v=new Vector();
		Movie m=new Movie(1,"Pushpa",4.5);
		Movie m1=new Movie(2,"Leo",3.8);
		Movie m2=new Movie(3,"KGF",4.7);
		Movie m3=new Movie(4,"Jawan",4.2);
		v.add(m);
		v.add(m1);
		v.add(m2);
		v.add(m3);
		System.out.println("Top Rated Movies:");
		for(Object obj:v)
		{
			Movie mo=(Movie)obj;
			if(mo.getRating()>4)
			{
				System.out.println(mo.getMovieName());
			}
		}

	}

}
