/*Q9. Store N Words in a HashMap. Print Words whose length is prime number.
Input :java python sql codex spring
Output: Words with Prime Length
sql-3
codex-5*/
package vectorExam;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = xyz.nextLine();
		String[] str = s.split(" ");
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 1; i < str.length; i++) {
			int cnt=0;
				if(str[i].length()%i==0)
				{
					cnt++;			
			} 
				if(cnt<=2) {
					map.put(str[i], str[i].length());
				}

		}
	
		
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
		}

	}

}
