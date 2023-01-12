package com.company.lesson44;

import java.time.LocalDate;

public class Card {
    String cardNumber;
    String holderName;
    LocalDate exp           ;
    Integer cvv;

    public Card(String cardNumber, String holderName, LocalDate exp, Integer cvv) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.exp = exp;
        this.cvv = cvv;
    }
}
