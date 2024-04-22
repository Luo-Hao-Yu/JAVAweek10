import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: "+ today);

        LocalDate brithday = LocalDate.of(2003,11,23);
        System.out.println("Brithday: "+brithday);

        today.plusDays(5);
        System.out.println(today);
        System.out.println(today.plusDays(5));

        String timeStr = "12:34:56";
        LocalTime parsedTime = LocalTime.parse(timeStr);
        System.out.println("解析后的时间：" + parsedTime);

        LocalTime time1 = LocalTime.of(20, 30);
        LocalTime time2 = LocalTime.of(12, 45);
        int compareResult = time1.compareTo(time2);
        System.out.println(compareResult);

        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        System.out.println("时间间隔为：" + hours + "小时" + minutes + "分钟");

        LocalTime time = LocalTime.of(10, 30, 45, 123456789);
        LocalTime modifiedTime = time.withHour(3).withMinute(15).withSecond(30).withNano(987654321);
        System.out.println("修改后的时间：" + modifiedTime);

        ZonedDateTime nowTime = ZonedDateTime.now();
        System.out.println("当前时区日期和时间： "+nowTime);

        ZonedDateTime specificTime = ZonedDateTime.of(2000,1,1,3,34,4,423, ZoneId.of("Asia/Shanghai"));
        System.out.println("指定时区日期： "+specificTime);

        System.out.println(specificTime.withZoneSameInstant(ZoneId.of("America/New_York")));
        System.out.println(specificTime.withZoneSameLocal(ZoneId.of("America/New_York")));
        System.out.println(specificTime.withZoneSameLocal(ZoneId.of("America/New_York")).getOffset());

        LocalTime time3 = LocalTime.of(10, 30);
        LocalTime time4 = LocalTime.of(15, 45);
        Duration duration1 = Duration.between(time3, time4);
        System.out.println(duration1);
        System.out.println(duration1.toHours());
        System.out.println(duration1.toMinutes());
        System.out.println(duration1.toDays());

        Period period = Period.between(LocalDate.of(1995, 7, 23), LocalDate.of(2022, 6, 24)); // 计算两个日期之间的间隔
        System.out.println("Period: " + period);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        DateTimeFormatter f =DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(f);
        System.out.println(formattedDateTime);
        LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime,f);
        System.out.println(parsedDateTime);

    }
}
