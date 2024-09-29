import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalCostCalculator {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";
        double discount = 15;
        double totalCost = calculateTotalCost(paragraph, discount);
        System.out.printf("Total cost after discount: %.2f TK%n", totalCost);
    }

    public static double calculateTotalCost(String paragraph, double discount) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(paragraph);
        int laptopPrice = 0;
        int mousePrice = 0;

        if (matcher.find()) laptopPrice = Integer.parseInt(matcher.group());
        if (matcher.find()) mousePrice = Integer.parseInt(matcher.group());

        double totalCost = laptopPrice + mousePrice;
        return totalCost * (1 - discount / 100);
    }
}
