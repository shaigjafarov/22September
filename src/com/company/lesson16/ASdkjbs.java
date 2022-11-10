//package com.company.lesson16;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ASdkjbs {
//
//    public static  List<Boolean> camelMatch(String[] queries, String pattern) {
//        List<Boolean> list = new ArrayList<>();
//
//        for (var q : queries) {
//            int index = 0;
//            boolean flag = true;
//            for (var c : q.toCharArray()) {
//                if(index < pattern.length() && c == pattern.charAt(index)){
//                    index++;
//                    continue;
//                }
//                if(c >= 'A' && c <= 'Z'){
//                    if(index >= pattern.length() || c != pattern.charAt(index)){
//                        flag = false;
//                        break;
//                    }
//                }
//            }
//            flag = flag && index == pattern.length();
//            list.add(flag);
//        }
//        return list;
//    }
//
//    public static void main(String[] args) {
//        camelMatch(new String[]{"FoasdBa","FoasdBaTejhs"}, "FoBaT");
//
//    }
//}
