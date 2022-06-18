import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
    public LocalDateTime momentDateTime;

    public Gigasecond(LocalDate moment) {        
        this.momentDateTime = LocalDateTime.of(moment ,LocalTime.of(0, 0, 0));
    }

    public Gigasecond(LocalDateTime moment) {
        this.momentDateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return momentDateTime.plusSeconds(1000000000);
    }
}
