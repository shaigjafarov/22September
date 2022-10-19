package com.company.lesson8;

public class NewArr {
    public static void main(String[] args) {
        String [] bugs = { "cricket", "beetle", "ladybu" };
        String [] alias ={ "cricket", "beetle", "ladybug" };
//        bugs[0]="ad";

        boolean  result=false;

        if(bugs.length==alias.length)
        for (int i = alias.length-1; i >=0 ; i--) {
           if(alias[i].equals(bugs[i])){
              result=true;
           }else {
             result=false;
               break;
           }
        }

        if(result){
            System.out.println("beraberdi");
        }else System.out.println("beraber deyil");



    }
}
