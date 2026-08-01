/*Q14.Create Player class:
 *  ● playerId 
 *  ● playerName 
 *  ● runs Store 
 *  players in Vector and display players who scored even runs.
 *   Description Logical condition: runs % 2 == 0 
 *   Input 
 *   1 Virat 75 
 *   2 Rohit 80 
 *   3 Gill 66 
 *   4 KL 59 
 *   Output 
 *   Players with even runs:  
 *   2 Rohit 80 
 *   3 Gill 66 */
package Assignment;

import java.util.*;

class Player {
	private int playerId;
	private String playerName;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	private int runs;

	Player(int playerId, String playerName, int runs) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.runs = runs;
	}

}

public class Q14Player {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of players");
		int n=xyz.nextInt();
		Vector <Player>v=new Vector<Player>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter player Id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter Player Name");
			String playerName=xyz.nextLine();
			System.out.println("Enter Player Runs");
			int runs=xyz.nextInt();
			Player p=new Player(id,playerName,runs);
			v.add(p);
		}
		System.out.println("Players with even runs: ");
		for(Player p:v)
		{
			if(p.getRuns()%2==0)
			{
				System.out.println(p.getPlayerId()+"\t"+p.getPlayerName()+"\t"+p.getRuns());
			}
		}
		

	}

}
