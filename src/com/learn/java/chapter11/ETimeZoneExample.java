package com.learn.java.chapter11;

import java.time.*;

public class ETimeZoneExample {

    public static void main(String[] args) {

        ZonedDateTime z = ZonedDateTime.now();
        System.out.println("1::: " + z);
        System.out.println("2::: " + z.getOffset());
        System.out.println("3::: " + z.getZone());
        System.out.println("4::: " + ZoneId.getAvailableZoneIds());
        System.out.println("5::: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));//2022-03-23T14:12:01.126966600-05:00[America/Chicago]

        System.out.println("6::: " + ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));//2022-03-23T14:12:01.128962700-05:00[America/Chicago]

        //Create LocalDateTime using timezone
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("7::: " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("8::: " + localDateTime1);

        //Converting LocalDateTime to ZonedDateTime
        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println("9::: " + localDateTime3.atZone(ZoneId.of("America/Chicago")));


        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("America/Chicago"));
        System.out.println("10::: " + zonedDateTime);

        OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(-3));
        System.out.println("11::: " + offsetDateTime);//just add offset, but zone id will not be there
    }
}


