package com.company.lesson44;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJava {


    public static void main(String[] args) {


        List<UserC> userCS = List.of(
                new UserC("Salam", "Salamov", LocalDate.of(2000, 1, 1), 12.0, CurrencyEnum.AZN),
                new UserC("Sal345", "Hemidov", LocalDate.of(1999, 1, 1), 20.0, CurrencyEnum.AZN),
                new UserC("Salam12", "Caopaye", LocalDate.of(2006, 1, 1), 34.0, CurrencyEnum.AZN),
                new UserC("Salam23", "Suleymanov", LocalDate.of(2009, 1, 1), 34.0, CurrencyEnum.AZN)
        );


        Set<Card> cards = userToCardGenerate(userCS);



    }



   static Set<Card> userToCardGenerate(List<UserC> userCList){

       return userCList.stream().filter(a->a.birthdate.plusYears(18).isBefore(LocalDate.now())&& a.paidAmount>=20.0)

                .map(a->new Card("2384798237492374",a.name+" "+ a.surname,LocalDate.now().plusYears(3),new Random().nextInt(899)+100)).collect(Collectors.toSet());

    }
}
