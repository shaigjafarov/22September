package com.company.lesson38.transfer;

import com.company.lesson38.transfer.check.TarnsferUtil;
import com.company.lesson38.transfer.exceptions.SameCardExceptions;
import com.company.lesson38.transfer.model.Card;
import com.company.lesson38.transfer.model.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<User> userList = new ArrayList<>();

        userList.add(new User(1, "Kamil", "Əliyev", LocalDate.of(2003, 10, 13)));
        userList.add(new User(2, "Fərhad", "Kamilov", LocalDate.of(2002, 9, 21)));
        userList.add(new User(3, "Nizami", "Zeynalabdin", LocalDate.of(2003, 5, 27)));
        userList.add(new User(4, "Hümbət", "Hümbətov", LocalDate.of(1998, 12, 19)));
        userList.add(new User(5, "Sadiq", "Abdullayev", LocalDate.of(1995, 1, 8)));
//        userList.add(new User(6, "Hacıağa", "Musayev", LocalDate.of(2003, 10, 18)));


        List<Card> userCards = new ArrayList<>();
        userCards.add(new Card(userList.get(0).getName() + " " + userList.get(0).getSurname()
                , "5674378987658856"
                , LocalDate.now().plusYears(3)
                , 356
                , 5782.0
                , userList.get(0).getId())
        );


        userCards.add(new Card(userList.get(1).getName() + " " + userList.get(1).getSurname()
                , "5674378989653456"
                , LocalDate.now().minusDays(10)
                , 689
                , 2000.0
                , userList.get(1).getId())
        );

        userCards.add(new Card(userList.get(2).getName() + " " + userList.get(2).getSurname()
                , "5674378987653456"
                , LocalDate.now().plusYears(3)
                , 123
                , 2500.0
                , userList.get(2).getId())
        );

        userCards.add(new Card(userList.get(3).getName() + " " + userList.get(3).getSurname()
                , "5674378987654556"
                , LocalDate.now().plusYears(3)
                , 567
                , 4000.0
                , userList.get(3).getId())
        );
        userCards.add(new Card(userList.get(4).getName() + " " + userList.get(4).getSurname()
                , "5674378987657756"
                , LocalDate.now().plusYears(3)
                , 967
                , 1560.0
                , userList.get(4).getId())
        );

        userList.forEach(System.out::println);
        System.out.println("Userin idsini daxil edin :");
        Integer secilmisUser = sc.nextInt();

        Card senderCard = TarnsferUtil.checkUserCard(secilmisUser, userCards);
        System.out.println(senderCard);
        System.out.println("To card 16digit:");
        String toCardNumber = sc.next();
        if(senderCard.getCardNum().equals(toCardNumber))
            throw new SameCardExceptions();
        Card receiverCard = TarnsferUtil.checkCardExist(toCardNumber, userCards);
        System.out.println(receiverCard);
        System.out.println("Please Enter Amount: ");
        Double amount= sc.nextDouble();
        TarnsferUtil.checkBalance(senderCard, amount);
        senderCard.setBalance(senderCard.getBalance()-amount);
        receiverCard.setBalance(receiverCard.getBalance()+amount);
        System.out.println("Transfer is successful");

        System.out.println(senderCard);
        System.out.println(receiverCard);







    }
}
