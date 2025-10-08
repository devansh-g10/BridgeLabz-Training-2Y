import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a date (YYYY-MM-DD): ");
            String inputDate = scanner.nextLine();
            
            LocalDate date = LocalDate.parse(inputDate);
            LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
            
            System.out.println("Original date: " + date);
            System.out.println("After date arithmetic: " + modifiedDate);
        }
    }
}