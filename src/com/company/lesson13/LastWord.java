package com.company.lesson13;

public class LastWord {

    public static void main(String[] args) {
        String a = "   fly me   to   the moon";

        StringBuilder sb = new StringBuilder(a);

        for (int i = sb.length() - 1; i >= 0; i--) {
           if(sb.charAt(i)==' '){
               sb.deleteCharAt(i);
           }else break;
        }
        String substring = sb.substring(sb.lastIndexOf(" ") + 1);
        System.out.println(substring);
    }
}
