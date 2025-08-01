package Task_2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class DateandTImeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today's date: "+date);
        LocalTime time = LocalTime.now();
        System.out.println("Current time: "+time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time:"+dateTime);
    }
}
