package com.company.lesson45;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class StreamGen {


    public static void main(String[] args) {
//        boolean b = Stream.generate(() -> new Random().nextInt(100)).peek(System.out::println).anyMatch(a -> a == 45);
        Stream.generate(StreamGen::nese).peek(System.out::println).filter(a -> a == 45).limit(4L).count();

    }



    public static Integer nese(){
        return 5;
     }
}
