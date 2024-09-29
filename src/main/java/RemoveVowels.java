public class RemoveVowels {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        String output = removeVowels(input);
        System.out.println(output);
    }

    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

