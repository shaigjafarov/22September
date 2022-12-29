package com.company.lesson41;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

public class Exercie {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Sahil", "Sahilov", LocalDate.of(2001, 01, 01), LocalDate.now().plusDays(3)),
                new User("Cingiz", "Cingizov", LocalDate.of(1999, 01, 01), LocalDate.now().plusDays(3)),
                new User("Ferid", "Feridov", LocalDate.of(2002, 01, 01), LocalDate.now().minusDays(3)),
                new User("Resad", "Resadov", LocalDate.of(1998, 01, 01), LocalDate.now().plusDays(3)),
                new User("Kenan", "Kenanov", LocalDate.of(1997, 01, 01), LocalDate.now().plusDays(3)));

//with lambda
//        users.forEach((u)->{
//            if(u.expDate.isAfter(LocalDate.now()))
//                System.out.println(u);
//        });

// with anonim inner class
//        Consumer<User> userConsumer = new Consumer<User>() {
//            @Override
//            public void accept(User u) {
//                if(u.expDate.isAfter(LocalDate.now()))
//                System.out.println(u);
//            }
//        };
//        users.forEach(userConsumer);


//        Consumer<User> userConsumer= ;

        try {
            users.forEach(new ConsumImpl<User>());
        } catch (UserExpException e) {
            System.out.println("userler arasinda exp user var");
        }


    }


}

class ConsumImpl<T> implements Consumer<T> {


    @Override
    public void accept(T t) {
        User u = (User) t;
        if (u.expDate.isAfter(LocalDate.now()))
            System.out.println(u);
        else
            throw new UserExpException();
    }
}

class UserExpException extends RuntimeException {

}

class User {
    String name;
    String surname;
    LocalDate birtDate;
    LocalDate expDate;

    public User(String name, String surname, LocalDate birtDate, LocalDate expDate) {
        this.name = name;
        this.surname = surname;
        this.birtDate = birtDate;
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birtDate=" + birtDate +
                ", expDate=" + expDate +
                '}';
    }
}
