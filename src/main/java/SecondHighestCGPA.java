public class SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double max = -1;
        double secondMax = -1;

        for (double score : cgpa) {
            if (score > max) {
                secondMax = max;
                max = score;
            } else if (score > secondMax && score != max) {
                secondMax = score;
            }
        }

        System.out.println("2nd highest CGPA: " + secondMax);
    }
}
