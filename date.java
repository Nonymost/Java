
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class date {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E MMM-dd-yyyy HH:mm:ss");

        String formattedDate = dateFormat.format(dateTime);
        System.out.println(formattedDate);
    }
}