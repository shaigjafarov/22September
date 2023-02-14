package com.company.lesson54;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.a);
        deyerVer(student);
        System.out.println(student.a);
        deyerVer(student.a);
        System.out.println(student.a);
    }
    public static void deyerVer(Student student){
        student.a=new StringBuilder("Salam");
    }

    public static  void deyerVer(StringBuilder deyer){
      deyer.append("123");
    }
}
class  Student{
    StringBuilder a;
}
