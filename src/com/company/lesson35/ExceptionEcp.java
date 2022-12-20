package com.company.lesson35;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionEcp {
    public static void main(String[] args) {

        new A().bolmeCagir2();
        Scanner sc=new Scanner(System.in);
        Integer a=null;

//        try {
//           bolme(sc.nextInt(), sc.nextInt());
//        } catch (Exception e) {
//            System.out.println("Bolmede xeta");

//        }
//
//       if(!(a ==null)){
//           System.out.println("Bolundu"+a);
//       }

    }


    static   Integer bolme(int a, int b) throws  Exception{
       return a/b;
    }





}


class  A{
    void bolmeCagir2(){
        try {
            new B().bolmeCagir();
        }catch (Exception e){

            System.out.println("FIle folderde movcud deyil");

        }


    }
}

class B{

    void bolmeCagir() throws Exception{
        new C().bolme();
    }
}
class C{
    void bolme ()throws ArithmeticException, NullPointerException{
//        throw new ArithmeticException();


    }


}

