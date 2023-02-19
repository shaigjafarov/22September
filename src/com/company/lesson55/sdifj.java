package com.company.lesson55;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sdifj {



        public static void main(String[] args) throws IOException {
            ArrayList<String> dataList = new ArrayList<>();

//        BufferedReader reader = new BufferedReader(new FileReader("C:\\IntellijIDEA\\Tasks1\\src\\az\\company\\task\\JavaFiles\\secret_message.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("nese234.txt"));
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                dataList.add(line);
                line = reader.readLine();
                i++;
            }

            reader.close();

            String[] array = dataList.toArray(new String[i]);//new String[0] ???????????????????????????????

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            List<LocalDateTime> datesList = new ArrayList<>();
            for (int k = 0; k < i; k++) {
                LocalDateTime xd = LocalDateTime.parse(array[k], dateTimeFormatter);
                datesList.add(xd);
            }
            Collections.sort(datesList);
//        datesList.forEach(System.out::println);

            for (LocalDateTime b: datesList) {
                System.out.println(b.format(dateTimeFormatter));
            }

        }

    }

