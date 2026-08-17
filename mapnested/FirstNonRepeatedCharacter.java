/*Question 5 – First Non-Repeated Character Using Map
Statement:
Given a string containing uppercase, lowercase, spaces and special characters, use a Map to find the first non-repeated alphabetic character. The comparison should be case-insensitive.
Explanation:
•	Convert the string to lowercase. 
•	Ignore spaces and special characters. 
•	Store character frequency using Map<Character, Integer>. 
•	Traverse the original processed characters again. 
•	Find the first character whose frequency is exactly 1. 
Input:
"Swiss Programming"
Output:
First Non-Repeated Character = w
*/
import java.util.*;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "Swiss Programming";

        // Convert to lowercase
        str = str.toLowerCase();

        // Map to store character frequency
        Map<Character, Integer> map = new LinkedHashMap<>();


        // First pass: calculate frequency
        for (char ch : str.toCharArray()) {

            // Only alphabetic characters
            if (Character.isLetter(ch)) {

                map.put(
                    ch,
                    map.getOrDefault(ch, 0) + 1
                );
            }
        }


        // Second pass: find first non-repeated character
        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch)) {

                if (map.get(ch) == 1) {

                    System.out.println(
                        "First Non-Repeated Character = "
                        + ch
                    );

                    break;
                }
            }
        }
    }
}