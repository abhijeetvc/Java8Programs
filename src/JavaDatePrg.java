import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaDatePrg {

    public static void main(String[] args) {
        DateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d=new Date();
        System.out.println(sdf.format(d));

        //Java 8
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(dtf.format(ldt));

        LocalDate ld= LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(ld));

        LocalDateTime ldt1=LocalDateTime.of(2020, Month.AUGUST,16,17,45);
        System.out.println(DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy").format(ldt1));

        ZonedDateTime zdt=ldt1.atZone(ZoneId.of("Asia/Kuala_Lumpur"));
        System.out.println(DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy").format(zdt));
    }
}
