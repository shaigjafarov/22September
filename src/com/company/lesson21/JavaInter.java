package com.company.lesson21;

public class JavaInter implements JavaInterAta , Dayi{

    String name;




    public JavaInter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }

    @Override
    public Integer cem(int a, int b) {
        return a+b;
    }

    @Override
    public Integer cixma(int a, int b) {
        return a-b;
    }

    @Override
    public  void ataninAdi(){
        System.out.println("ClassAta");
    }


}
