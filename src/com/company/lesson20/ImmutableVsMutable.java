package com.company.lesson20;

public class ImmutableVsMutable {

    private StringBuilder sb;

    public ImmutableVsMutable(StringBuilder sb) {
        this.sb = sb;
    }

    StringBuilder getA() {
        StringBuilder sb1 = new StringBuilder(sb.toString());
        return sb1;
    }

//    String append(String str){
//
//        if(a==null){
//            a=str;
//            return str;
//        }
//        a+=str;
//        return a;
//    }

    @Override
    public String toString() {
        return "ImmutableVsMutable{" +
                "a='" + sb + '\'' +
                '}';
    }
}
