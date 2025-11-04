import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
                "Critical: Patient heartbeat low",
                "Info: Appointment reminder",
                "Emergency: ICU needed",
                "General: Visitor arrived"
        );

        Predicate<String> isEmergency = alert -> alert.contains("Critical") || alert.contains("Emergency");

        System.out.println("Filtered Emergency Alerts:");
        alerts.stream().filter(isEmergency).forEach(System.out::println);
    }
}
