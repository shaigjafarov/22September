package com.company.lesson39;

import com.company.lesson32.A;

public class OzAnonimosInnerClassimiz {


    public static void main(String[] args) {

        class  As{
            public As(){
            }
        }
        QacAble qax= new QacAble() {
            @Override
            public void qac() {
                System.out.println("asdisad");
            }
        };
        qax.qac();
        new QacAble(){
            @Override
            public void qac() {
                System.out.println("Salam");
            }
        }.qac();
    }
}
abstract class QacAble{

    public abstract void  qac();


}
