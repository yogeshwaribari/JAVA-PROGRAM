import java.util.*;

public class CollecionFram {
	public static void main(String[] args) {
		LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();
		ArrayList <String> al = new ArrayList<String>();
		al.add("Virat");
		al.add("Rohit");
		al.add("Dhoni");
		
		map.put("India", al);
		
		ArrayList <String> al1 = new ArrayList<String>();
		al1.add("Smith");
		al1.add("Warnar");
		al1.add("Finch");
			map.put("AUS", al1);
		Set<Map.Entry<String, ArrayList<String>>> set=map.entrySet();
		for(Map.Entry<String, ArrayList<String>> m:set) {
			System.out.println("Team Name "+m.getKey());
			ArrayList<String> a=m.getValue();
			for(String n:a) {
				System.out.println(n);
			}
		}	
	}
}
