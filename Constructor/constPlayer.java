/*Question 11: Write a Java program to create a Player class and find the player with highest runs.

Description: Create a Player POJO class having playerId, playerName and runs. Initialize using 
constructor. Store 5 player objects in an array and find the player who scored maximum runs.
INPUT:
Enter Player Details:
Player1: 1 Virat 85
Player2: 2 Rohit 120
Player3: 3 KL 45
Player4: 4 Gill 95
Player5: 5 Hardik 60

OUTPUT:
Highest Run Scorer: Rohit
Runs: 120

EXPLANATION:
Create Player class with playerId, playerName, runs. Use constructor to initialize each player.
 Create array Player[] players = new Player[5]. Store 5 player objects. Loop through array, 
 find maximum runs and display player name with max runs.*/
 import java.util.*;
 class Player{
	 int playerId;
	 String playerName;
	 int runs;
	 
	 Player(int playerId,String playerName,int runs)
	 {
		 this.playerId=playerId;
		 this.playerName=playerName;
		 this.runs=runs;
	 }
	 void display()
	 {
		 System.out.println("Highest Run Scorer:"+playerName);
		 System.out.println("Runs: "+runs);
	 }
 }
 class constPlayer
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 Player p[]=new Player[5];
		 for(int i=0;i<p.length;i++)
		 {
			 System.out.println("Enter Player Id");
			 int playerId=xyz.nextInt();
			 xyz.nextLine();
			 System.out.println("Enter Player Name");
			 String playerName=xyz.nextLine();
			 System.out.println("Enter Runs");
			 int runs=xyz.nextInt();
			 
			 p[i]=new Player(playerId,playerName,runs);
		 }
		 int max=p[0].runs;
		 int index=0;
		 for(int i=1;i<p.length;i++)
		 {
			 if(p[i].runs>max)
			 {
				 max=p[i].runs;
				 index=i;
			 }
		 }
		 p[index].display();
	 }
 }