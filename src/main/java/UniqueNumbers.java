import java.util.HashMap;
import java.util.Map;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
        HashMap<Integer, Integer> numberCountMap = new HashMap<>();

        for (int num : numbers) {
            if (numberCountMap.containsKey(num)) {
                numberCountMap.put(num, numberCountMap.get(num) + 1);
            } else {
                numberCountMap.put(num, 1);
            }
        }

        System.out.println("Unique numbers (not duplicates):");
        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}


