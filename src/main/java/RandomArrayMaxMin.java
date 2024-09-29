
import java.util.Arrays;
import java.util.Random;

public class RandomArrayMaxMin {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Numbers: " + Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) max = number;
            if (number < min) min = number;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

