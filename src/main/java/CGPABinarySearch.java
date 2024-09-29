import java.util.Scanner;

public class CGPABinarySearch {
    public static void main(String[] args) {

        double[] cgpa = {3.30, 3.32, 3.43, 3.48, 3.50, 3.52, 3.60, 3.63, 3.75, 3.86};


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the CGPA to search: ");
        double target = input.nextDouble();


        int result = binarySearch(cgpa, target);


        if (result == -1) {
            System.out.println("CGPA not found in the array.");
        } else {
            System.out.println("CGPA found at index: " + result);
        }
    }


    public static int binarySearch(double[] cgpa, double target) {
        int left = 0;
        int right = cgpa.length - 1;


        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Check if target is present at mid
            if (cgpa[mid] == target) {
                return mid;
            }


            if (cgpa[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}