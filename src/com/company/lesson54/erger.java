package com.company.lesson54;

public class erger {


    public static String create44(String pan) {
        return pan.replaceAll("^(\\w{4}).+(\\w{4})$", "$1********$2");
    }

    public static String create64(String pan) {
        return pan.replaceAll("^(\\w{6}).+(\\w{4})$", "$1******$2");
    }

    public static String create44WithDot(String cardNum) {
        return cardNum != null
                ? cardNum.replaceAll("^(\\w{4}).+(\\w{4})$", "$1••••••••$2")
                : null;
    }

//    public static String replaceAsterisks(String cardNum) {
//        return cardNum.replace("*", UtilFunctions.CENTERED_DOT);
//    }

    public static void main(String[] args) {
        String car="1234123412341234";
        System.out.println(create44(car));
        System.out.println(create64(car));
        System.out.println(create44WithDot(car));
    }
}
