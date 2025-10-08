import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        int max = 0;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
