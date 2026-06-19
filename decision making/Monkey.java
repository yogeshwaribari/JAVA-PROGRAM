/*
Question 34: There are a total n number of monkeys sitting on the branches of a huge tree. As travelers offer bananas 
and peanuts, the monkeys jump down the tree. If every Monkey can eat k Bananas and j Peanuts. If the total m number of 
Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of 
them jumped down to eat.
At a time one Monkey gets down and finishes eating and goes to the other side of the road. The Monkey who climbed down
 does not climb up again after eating until the other Monkeys finish eating.
Monkeys can either eat k Bananas or j Peanuts. If for the last monkey there are less than k Bananas left on the ground
or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<j).
Write code to take inputs as n, m, p, k, j and return the number of Monkeys left on the Tree.
Where,
n= Total no of Monkeys
k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
m = Total number of Bananas
p = Total number of Peanuts
Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero.
Example : Input Values 20  2  3  12  12
   Output Values Number of Monkeys left on the tree : 10
Input:
n = 20
k = 2
j = 3
m = 12
p = 12

Output
Number of Monkeys left on the tree: 10

Explanation:
Banana-eating monkeys = 12 / 2 = 6
Peanut-eating monkeys = 12 / 3 = 4
Total monkeys that came down = 6 + 4 = 10
Remaining monkeys = 20 – 10 = 10
*/
import java.util.Scanner;
class Monkey{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input values");
		int n, k, j, m, p;
		n= xyz.nextInt();
		k= xyz.nextInt();
		j= xyz.nextInt();
		m= xyz.nextInt();
		p= xyz.nextInt();
		//Banana-eating monkeys = 12 / 2 = 6
		int bananasMonkey = m/k;
		System.out.println("Banana-eating monkeys ="+bananasMonkey);
		int peanutsMonkey = p/j;
		System.out.println("Peanut-eating monkeys = "+peanutsMonkey);
		int totalDown =bananasMonkey+peanutsMonkey;
		System.out.println("Total monkeys that came down = "+totalDown);
		int rem = n-totalDown;
		if(rem>=0)
	
		System.out.println("Number of Monkeys left on the tree:"+rem);
		
		
	}
}