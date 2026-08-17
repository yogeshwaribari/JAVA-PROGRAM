/*Question 4 – Group Strings by Length
Statement:
Given a List<String>, use a Map<Integer, List<String>> to group all strings according to their length. Strings having the same length must be stored together.
Explanation:
•	Traverse the list. 
•	Find the length of every string. 
•	Use string length as the Map key. 
•	Store all strings having that length inside a List. 
•	Display the groups in ascending order of length. 
Input:
["Java", "Python", "SQL", "Spring", "C", "HTML", "React", "Go", "Oracle"]
Output:
1 = [C]
2 = [Go]
3 = [SQL]
4 = [Java, HTML]
5 = [React]
6 = [Python, Spring, Oracle]
________________________________________
*/
import java.util.*;

public class GroupStringsByLength {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Java",
                "Python",
                "SQL",
                "Spring",
                "C",
                "HTML",
                "React",
                "Go",
                "Oracle"
        );

        // TreeMap -> keys automatically ascending order
        Map<Integer, List<String>> map =
                new TreeMap<>();


        // Group strings according to length
        for (String str : list) {

            int length = str.length();

            map
                .computeIfAbsent(
                        length,
                        key -> new ArrayList<>()
                )
                .add(str);
        }


        // Display result
        for (Map.Entry<Integer, List<String>> entry
                : map.entrySet()) {

            System.out.println(
                    entry.getKey()
                    + " = "
                    + entry.getValue()
            );
        }
    }
}