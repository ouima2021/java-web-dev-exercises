package CountingCharactersStudio;

import java.util.HashMap;
import java.util.Map;

public class charCounts {

        public static void main(String[] args) {
            String myQuote = "He would burn this world to dust if he could be King of the ashes";
            HashMap<Character, Integer> phraseCounts = new HashMap<>();
            char[] charNumbers = myQuote.toCharArray();
            int sum;
            for (char c : charNumbers) {
                if (phraseCounts.containsKey(c)) {
                    sum = phraseCounts.get(c) + 1;
                    phraseCounts.put(c, sum);
                } else {
                    phraseCounts.put(c, 1);
                }
            }
            for (Map.Entry<Character, Integer> c : phraseCounts.entrySet()) {
                System.out.println(c.getKey() + " : " + c.getValue());
            }
        }
    }

