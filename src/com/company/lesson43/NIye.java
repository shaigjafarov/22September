package com.company.lesson43;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class NIye
{
    public static void main(String[] args)
    {
////        List<String> name = Arrays.asList("Muhammet", "Enes", "Akçayır");
////        List result = name.stream().filter(s -> s.startsWith("E")).collect(Collectors.toList());
//
        Stream<String> asd = Stream.of("Asd", "asd34", "asdsds");
       Stream as= asd.parallel().peek(System.out::println).map(String::length).peek(System.out::println).filter(a->a>3);
//
//        System.out.println("qweqwiueyqwi");
//
//        System.out.println(as.count());


//
//        List<String> name = Arrays.asList("Muhammet", "Enes", "Akçayır");
//        List<String> test = name.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(test);
//
//
//        List<String> namea = Arrays.asList("Yusuf", "Çakal");
//        namea.stream().map(s ->s.length()).forEach(System.out::println);

        List<Integer> number = Arrays.asList(5, 3, 2, 8);
        Optional<Integer> newNumber = number.stream().reduce( (i, i1) -> {
            System.out.println(i + i1);
            return i + i1;
        });


        Optional.of(null);
        Optional.ofNullable(null);
        Optional.empty();
//        System.ou.println(newNumber);


//        System.out.println(result);
    }
}
