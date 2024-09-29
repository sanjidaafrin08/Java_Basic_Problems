import java.util.Scanner;

public class LowestHeights {
    public static void main(String[] args) {
        int[] heights = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the height of 10 babies in cm:");
        for (int i = 0; i < 10; i++) {
            heights[i] = input.nextInt();
        }

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < lowest) {
                secondLowest = lowest;
                lowest = heights[i];
            } else if (heights[i] < secondLowest && heights[i] != lowest) {
                secondLowest = heights[i];
            }
        }

        System.out.println("The lowest height is: " + lowest + " cm");
        System.out.println("The second lowest height is: " + secondLowest + " cm");
    }
}
