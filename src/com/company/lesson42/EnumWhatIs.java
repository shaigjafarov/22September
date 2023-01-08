//package com.company.lesson42;
//
//import java.time.LocalDate;
//import java.time.Month;
//
//public class EnumWhatIs {
//
//
//    public static void main(String[] args) {
//        System.out.println( LocalDate.of(2022, Month.DECEMBER, 12));
//
//
//        for (AylarEnum sd:AylarEnum.values()) {
//            System.out.println(sd);
//
//        }
//        System.out.println(Month.DECEMBER);
//
//
//        nese(AylarEnum.IYUN);
//
//    }
//
//   static void  nese(AylarEnum ay){
//       System.out.println(ay.getOrder());
//       System.out.println(ay);
//
//
//       switch (ay.getOrder()){
//           case 1:
//               System.out.println("Hava 28  derece");
//               break;
//           case 2:
//               System.out.println("Hava 3  derece");
//               break;
//           case 3:
//               System.out.println("Hava -3  derece");
//               break;
//           case 6:
//               System.out.println("Hava 12  derece");
//               break;
//
//
//       }
//
////
////       System.out.println(ay.ordinal());
//
//
//
//
//    }
//}
