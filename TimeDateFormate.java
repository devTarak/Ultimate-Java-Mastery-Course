import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDateFormate {
    public static void main(String[] args) {
        LocalDateTime LD = LocalDateTime.now();
        System.out.println(LD);
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String outPut = LD.format(DF);
        System.out.println(outPut);
    }
}
