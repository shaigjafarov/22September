package com.company.lesson5;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("heftenin gunun daxil et");

        int hefteninGunu = new Scanner(System.in).nextInt();
//
//        switch (hefteninGunu) {
//            case 1:
//                System.out.println("Bazar ertesi");
//                break;
//            case 2:
//                System.out.println("Cersenbe axsami");
//                break;
//            default:
//                System.out.println("Hefte 7 gunden ibaretdi");
//        }
//        hefteninGunu=hefteninGunu+1;


            switch (++hefteninGunu) {
                case 7:
                    System.out.print("7 ");
                    hefteninGunu++;
                case 6:
                    System.out.print("6 ");
                case 5:
                    System.out.print("5 ");
                case 4:
                    System.out.print("4 ");
                case 3:
                    System.out.print("3 ");
                case 2:
                    System.out.print("2 ");
                case 1:
                    System.out.print("1 ");
                    break;
                default:
                    System.out.print("nezerde tutulmayib");
            }

        }
    }


