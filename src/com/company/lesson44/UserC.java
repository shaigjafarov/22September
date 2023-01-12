package com.company.lesson44;

import java.time.LocalDate;

public class UserC {

    String name;
    String surname;
    LocalDate birthdate;
    Double paidAmount;
    CurrencyEnum currency;

    public UserC(String name, String surname, LocalDate birthdate, Double paidAmount, CurrencyEnum currency) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.paidAmount = paidAmount;
        this.currency = currency;
    }
}
