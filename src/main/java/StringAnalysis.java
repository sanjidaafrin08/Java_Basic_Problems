import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        int wordCount = words.length;

        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ') {
                charCount++;

                if (isVowel(ch)) {
                    vowelCount++;
                } else if (isConsonant(ch)) {
                    consonantCount++;
                }
            }
        }

        System.out.println("Words: " + wordCount);
        System.out.println("Chars (without spaces): " + charCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return ch >= 'a' && ch <= 'z' && !isVowel(ch);
    }
}


