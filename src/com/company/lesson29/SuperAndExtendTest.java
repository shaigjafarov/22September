package com.company.lesson29;

public class SuperAndExtendTest {


    public static void main(String[] args) {

        GenericExp<?>  genericExp =  new GenericExp<>("Salam");

        Number  number= 4.0;
//        GenericExp<? extends Number>  genericExp1= new GenericExp<>();
//        GenericExp<? extends Integer>  genericExp2= new GenericExp<Number>();
//        GenericExp<? extends Number>  genericExp4= new GenericExp<Integer>();
        GenericExp<? super Number>  supper1=new GenericExp<Object>();
//        supper1.setT(new Object());

//        supper1.setT(number);
//        System.out.println(supper1.getT().getClass());

//        System.out.println( );

//        GenericExp<? extends Number>  genericExp2= new GenericExp<>(23.0);
        Object t = genericExp.getT();




    }


}
