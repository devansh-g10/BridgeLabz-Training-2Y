import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, bmi
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double w, h;
            do {
                System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
                w = sc.nextDouble();
            } while (w <= 0);
            do {
                System.out.println("Enter height (m) of person " + (i + 1) + ": ");
                h = sc.nextDouble();
            } while (h <= 0);

            double bmi = w / (h * h);
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = bmi;

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 24.9) weightStatus[i] = "Normal";
            else if (bmi < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) +
                               " | Weight: " + personData[i][0] +
                               " | Height: " + personData[i][1] +
                               " | BMI: " + personData[i][2] +
                               " | Status: " + weightStatus[i]);
        }
    }
}
