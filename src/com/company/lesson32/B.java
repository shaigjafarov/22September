package com.company.lesson32;

import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) {
        Number  number= 5;


        A<? extends Integer>  a= new A<Integer>(3);
        A<? super Integer>  b= new A<Integer>(3);
//        a.setDeyer(5);


        List<Integer> asdfs= new ArrayList<>();




        b.setDeyer(5);

//        B.<Object>asd(asdfs);



    }

   static  <T extends Number>  void  asd(List<T> sd){
        sd.add((T)(new Integer(4)));

    }
}
