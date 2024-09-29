public class CGPASorting {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        for (int i = 0; i < cgpa.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < cgpa.length; j++) {

                if (cgpa[j] > cgpa[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = cgpa[maxIndex];
            cgpa[maxIndex] = cgpa[i];
            cgpa[i] = temp;
        }

        System.out.println("Sorted CGPA in descending order:");
        for (double score : cgpa) {
            System.out.print(score + " ");
        }
    }
}

