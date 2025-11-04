import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {
        System.out.println(DateUtils.formatDate(LocalDate.now(), "dd-MM-yyyy"));
    }
}
