package com.company.lesson14;

import com.company.lesson15.MethodChain;
import java.util.Scanner;

public class MethodDeclare {


    public static void main(String[] args) {




        String jyadjs = birlesdir("asdfasd", "QYWUIEQ");

        System.out.println(jyadjs);
        System.out.println(Basqa.uzunluq(jyadjs));
    }


   static String birlesdir (String a,String b){
//       System.out.println(a+"___"+b);
       return  a+b;
   }






}
