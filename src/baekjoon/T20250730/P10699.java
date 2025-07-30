package baekjoon.T20250730;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class P10699 {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        today.atZone(ZoneId.of("Asia/Seoul")); // 서울 아시아 시간대 변환

        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
