/*Question 1 – Word Frequency from List
Statement:
Given a List<String> containing multiple sentences, use a Map to count the frequency of every word. Ignore case and punctuation. Display words in alphabetical order along with their frequency.
Explanation:
•	Convert each sentence into words. 
•	Remove punctuation and convert words to lowercase. 
•	Store each word as a key in Map. 
•	Increase its count whenever the word appears again. 
•	Finally, display the frequency map in alphabetical order. 
Input:
["Java is powerful", "Java is easy", "Python is powerful", "Java is popular"]
Output:
easy = 1
is = 4
java = 3
popular = 1
powerful = 2
python = 1
*/
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
            "Java is powerful",
            "Java is easy",
            "Python is powerful",
            "Java is popular"
        );

        Map<String, Integer> map = new TreeMap<>();

        for (String sentence : list) {

            String[] words = sentence.split("\\s+");

            for (String word : words) {

                word = word.toLowerCase();

                // Remove punctuation
                word = word.replaceAll("[^a-zA-Z0-9]", "");

                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}