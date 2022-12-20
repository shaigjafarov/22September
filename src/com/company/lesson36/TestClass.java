package com.company.lesson36;


public class TestClass {

    private Integer balance = 100;

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
//        try {
        testClass.checkCard("123456");
        testClass.checkBalance(101);
//            int a=0;
//            int b=5/a;
//        }catch (Exception e){
//
//            if(e instanceof Exception){
//                System.out.println("Online card sifaris verin ");
//            }
//            else  if (e instanceof InsufficientBalanceException){
//                System.out.println("Kredit gotur");
//            }


//            System.out.println(e.getMessage());
//            e.printStackTrace();


    }
//        }catch (InsufficientBalanceException e){
//            System.out.println("Balans yetersiz");
//            e.printStackTrace();
//        }catch (CardBlockedException cardBlockedException){
//            System.out.println("Cardiniz blocklansmisdir");
//            cardBlockedException.printStackTrace();
//        }


//        System.out.println();
//    }

    private Boolean checkBalance(int amount) {
        try {
            if (balance >= amount) {
                balance = balance - amount;
                return true;
            } else
            throw new InsufficientBalanceException("Yetersiz balans");
        }catch(InsufficientBalanceException e)

    {
        e.printStackTrace();
    }
       return false;
}
    private Boolean checkCard(String cardNumber) {
        if(cardNumber.equals("123456")){
            return true;
        }else throw  new CardBlockedException("Card Block olunub");

    }
}

class InsufficientBalanceException extends Exception {


    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class CardBlockedException extends RuntimeException {


    public CardBlockedException(String message) {
        super(message);
    }
}
