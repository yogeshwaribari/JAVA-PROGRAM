/*Question 3 – Character Frequency with Maximum and Minimum
Statement:
Given a string, use a Map<Character, Integer> to calculate the frequency of every character. Ignore spaces and case differences. Then find and display the character with the highest and lowest frequency.
Explanation:
•	Convert the string to lowercase. 
•	Ignore spaces. 
•	Store each character in a Map. 
•	Calculate frequency using the map. 
•	Find maximum and minimum frequency characters. 
Input:
"Java Programming Language"
Output:
Character Frequency:
a = 5
g = 4
r = 2
m = 2
j = 1
v = 1
p = 1
o = 1
i = 1
n = 2
l = 2
e = 1
u = 1

Highest Frequency:
a = 5

Lowest Frequency:
j = 1
________________________________________
*/
import java.util.*;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Convert to lowercase
        str = str.toLowerCase();

        // Calculate frequency
        for (char ch : str.toCharArray()) {

            // Ignore spaces
            if (ch == ' ') {
                continue;
            }

            map.put(
                ch,
                map.getOrDefault(ch, 0) + 1
            );
        }

        // Display frequency
        System.out.println("Character Frequency:");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(
                entry.getKey() + " = " + entry.getValue()
            );
        }


        // Find maximum and minimum frequency
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        char maxCharacter = '\0';
        char minCharacter = '\0';


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            char ch = entry.getKey();
            int frequency = entry.getValue();

            // Maximum
            if (frequency > maxFrequency) {

                maxFrequency = frequency;
                maxCharacter = ch;
            }

            // Minimum
            if (frequency < minFrequency) {

                minFrequency = frequency;
                minCharacter = ch;
            }
        }


        System.out.println("\nHighest Frequency:");
        System.out.println(
            maxCharacter + " = " + maxFrequency
        );


        System.out.println("\nLowest Frequency:");
        System.out.println(
            minCharacter + " = " + minFrequency
        );
    }
}