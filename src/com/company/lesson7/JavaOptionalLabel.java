package com.company.lesson7;

public class JavaOptionalLabel {
    public static void main(String[] args) {

         OUT: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.println(i + " " + j);
                if (j == 5)
                    break OUT;

            }

        }
    }
}
