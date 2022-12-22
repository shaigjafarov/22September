package com.company.lesson38.transfer.model;

import java.time.LocalDate;

public class Card {
    String holderName;
    String cardNum;
    LocalDate expireDate;
    Integer cvv;
    Double balance;
    Integer userId;

    public Card(String holderNum, String cardNum, LocalDate expireDate, Integer cvv, Double balance, Integer userId) {
        this.holderName = holderNum;
        this.cardNum = cardNum;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.balance = balance;
        this.userId = userId;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "holderNum='" + holderName + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", expireDate=" + expireDate +
                ", cvv=" + cvv +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
