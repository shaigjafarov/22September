package com.company.basc;

public class Util {

    public static boolean  validDateFormat(String date){
        return  date.matches("^(0[1-9]|[12][0-9]|[3][01])\\.(0[1-9]|1[012])\\.\\d{4}$");
    }
}
