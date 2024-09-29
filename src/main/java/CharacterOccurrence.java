import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String input = "I live in Dhaka";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ') {
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1);
                } else {
                    charCountMap.put(ch, 1);
                }
            }
        }

        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
