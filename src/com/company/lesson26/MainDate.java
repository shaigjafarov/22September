package com.company.lesson26;

import static java.time.temporal.ChronoField.DAY_OF_WEEK;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class MainDate {

    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now().plusMinutes(20);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyddm.MMM:hh");
//        System.out.println(ZonedDateTime.now().withZoneSameLocal( ZoneId.of("Europe/Kaliningrad")));

        LocalDateTime oldDateTime = LocalDateTime.now().plusHours(4);



        ZoneId oldZone = ZoneId.of("Asia/Baku");

        ZonedDateTime zonedDateTime = oldDateTime.atZone(oldZone);

        System.out.println(zonedDateTime);


        ZoneId newZone = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime1 = zonedDateTime
                .withZoneSameInstant(newZone);

        System.out.println(zonedDateTime1);


        //
//        String format = localDate.format(dateTimeFormatter);
//        System.out.println(format);
//
//       for (String st :ZoneId.SHORT_IDS.keySet()){
//           System.out.println(
//                   ZoneId.SHORT_IDS.get(st)
//           );
//
//
//       }
////        LocalDate localDate1 = LocalDate.now().plusYears(5L);
////        boolean after = localDate.isAfter(localDate1);
////        System.out.println(supported);
//

    }
}
