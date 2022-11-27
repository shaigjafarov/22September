package com.company.lesson27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
        String strDate = "2022-12-12";
        LocalDate localDate = LocalDate.parse(strDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM.yyyy");
//        String xczvcxvcbv = localDate.format(dateTimeFormatter);
        System.out.println(localDate.format(dateTimeFormatter));

    }
}

interface A {


    void a();
}
