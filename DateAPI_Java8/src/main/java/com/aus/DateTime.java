package  com.aus;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        Clock clock = Clock.systemDefaultZone();
        LocalDate sysdate = LocalDate.now();
        System.out.println(sysdate);

        ZoneId zoneId = ZoneId.of("America/Phoenix");
        LocalDate zoneDate = LocalDate.now(zoneId);
        System.out.println(zoneDate);

        LocalDate localDate1 = LocalDate.of(2022,01,30);
        System.out.println(localDate1);

        LocalDate localDate2 = localDate1.plusDays(10);
        System.out.println(localDate2);

    }
}
